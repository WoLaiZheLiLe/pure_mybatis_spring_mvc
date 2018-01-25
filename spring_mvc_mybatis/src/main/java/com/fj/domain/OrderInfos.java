package com.fj.domain;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfos {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 订单状态,0-默认状态,1-待支付,2-待提车,3-待还车,4-完成,5-支付超时,6-关闭,7-待确定,8-异常,10-风控拒绝
     */
    private Integer status;

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 联系号码
     */
    private String phone;

    /**
     * 车型编码
     */
    private String modelCode;

    /**
     * 预约车型
     */
    private String reserveModel;

    /**
     * 租金
     */
    private BigDecimal rent;

    /**
     * 
     */
    private BigDecimal totalAmount;

    /**
     * 
     */
    private BigDecimal actualAmount;

    /**
     * 违章预授权费用
     */
    private BigDecimal illegalFreezeAmount;

    /**
     * 其他预授权费用
     */
    private BigDecimal otherFreezeAmount;

    /**
     * 附加费用
     */
    private BigDecimal additionalAmount;

    /**
     * 是否退还租金:1-是,2-否
     */
    private Integer returnRent;

    /**
     * 保证金
     */
    private BigDecimal margin;

    /**
     * 保证金退还状态：0-未扣保证金（预授权）,1-未退还，2-已退还
     */
    private Integer returnMargin;

    /**
     * 保证金退还时间
     */
    private Date returnMarginTime;

    /**
     * 取车店铺code
     */
    private String driveShopCode;

    /**
     * 取车店铺名称
     */
    private String driveShopName;

    /**
     * 取车地址
     */
    private String pickAddress;

    /**
     * 还车门店代码
     */
    private String returnShopCode;

    /**
     * 还车门店名称
     */
    private String returnShopName;

    /**
     * 还车地址
     */
    private String returnAddress;

    /**
     * 车牌
     */
    private String licensePlate;

    /**
     * 停车位
     */
    private String parkPlace;

    /**
     * 钥匙柜抽屉号
     */
    private String keyDrawerCode;

    /**
     * 钥匙柜号
     */
    private String keyCabinetCode;

    /**
     * 取车日
     */
    private Date pickDay;

    /**
     * 取车时间,上午，下午
     */
    private String pickTime;

    /**
     * 实际取车时间
     */
    private Date realPickTime;

    /**
     * 还车日，还车时间
     */
    private Date returnTime;

    /**
     * 实际还车时间
     */
    private Date realReturnTime;

    /**
     * 订单来源：1-支付宝,2-活动，3-淘宝
     */
    private Integer orderFrom;

    /**
     * 取消原因:1-客户时间安排有变,2-想要体验其他车型,3-不想试驾了,4-已经买车，不需要试驾;5-具体其他原因
     */
    private String cancelReason;

    /**
     * 创建时间
     */
    private Date dateCreate;

    /**
     * 修改时间
     */
    private Date dateUpdate;

    /**
     * 删除时间
     */
    private Date dateDelete;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 商户请求流水号
     */
    private String orderRequestNo;

    /**
     * 关联用户id
     */
    private String userId;

    /**
     * 开始授权时间
     */
    private Date beginAuthTime;

    /**
     * 订单关闭时间
     */
    private Date cancelTime;

    /**
     * 支付有效时间
     */
    private Date payValidTime;

    /**
     * 其他预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     */
    private String otherFreezeAmountStatus;

    /**
     * 违章预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     */
    private String illegalFreezeAmountStatus;

    /**
     * 附加费用的状态 ：NOTPAY：未支付  PAID：已支付
     */
    private String additionalAmountStatus;

    /**
     * 还车验车员
     */
    private String returnCarInspectionStaff;

    /**
     * 提车验车员
     */
    private String pickCarInspectionStaff;

    /**
     * 是否有购车意愿 T：有意愿 F：没有意愿
     */
    private String isWillingBuyCar;

    /**
     * 还车时油量
     */
    private Integer returnCarOilMassCell;

    /**
     * 提车时油表格数（一共16格）
     */
    private Integer pickCarOilMassCell;

    /**
     * 是否人脸识别  T是  F否
     */
    private String isFaceRecognition;

    /**
     * 还车区域
     */
    private String returnParkPlace;

    /**
     * 实际意向金
     */
    private BigDecimal actualMargin;

    /**
     * 实际租金
     */
    private BigDecimal actualRent;

    /**
     * 芝麻分数
     */
    private Integer zhimaScore;

    /**
     * 序号
     * @return id 序号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 序号
     * @param id 序号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 订单状态,0-默认状态,1-待支付,2-待提车,3-待还车,4-完成,5-支付超时,6-关闭,7-待确定,8-异常,10-风控拒绝
     * @return status 订单状态,0-默认状态,1-待支付,2-待提车,3-待还车,4-完成,5-支付超时,6-关闭,7-待确定,8-异常,10-风控拒绝
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 订单状态,0-默认状态,1-待支付,2-待提车,3-待还车,4-完成,5-支付超时,6-关闭,7-待确定,8-异常,10-风控拒绝
     * @param status 订单状态,0-默认状态,1-待支付,2-待提车,3-待还车,4-完成,5-支付超时,6-关闭,7-待确定,8-异常,10-风控拒绝
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 订单编号
     * @return order_number 订单编号
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 订单编号
     * @param orderNumber 订单编号
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * 用户姓名
     * @return username 用户姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户姓名
     * @param username 用户姓名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 联系号码
     * @return phone 联系号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系号码
     * @param phone 联系号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 车型编码
     * @return model_code 车型编码
     */
    public String getModelCode() {
        return modelCode;
    }

    /**
     * 车型编码
     * @param modelCode 车型编码
     */
    public void setModelCode(String modelCode) {
        this.modelCode = modelCode == null ? null : modelCode.trim();
    }

    /**
     * 预约车型
     * @return reserve_model 预约车型
     */
    public String getReserveModel() {
        return reserveModel;
    }

    /**
     * 预约车型
     * @param reserveModel 预约车型
     */
    public void setReserveModel(String reserveModel) {
        this.reserveModel = reserveModel == null ? null : reserveModel.trim();
    }

    /**
     * 租金
     * @return rent 租金
     */
    public BigDecimal getRent() {
        return rent;
    }

    /**
     * 租金
     * @param rent 租金
     */
    public void setRent(BigDecimal rent) {
        this.rent = rent;
    }

    /**
     * 
     * @return total_amount 
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 
     * @param totalAmount 
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 
     * @return actual_amount 
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * 
     * @param actualAmount 
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * 违章预授权费用
     * @return illegal_freeze_amount 违章预授权费用
     */
    public BigDecimal getIllegalFreezeAmount() {
        return illegalFreezeAmount;
    }

    /**
     * 违章预授权费用
     * @param illegalFreezeAmount 违章预授权费用
     */
    public void setIllegalFreezeAmount(BigDecimal illegalFreezeAmount) {
        this.illegalFreezeAmount = illegalFreezeAmount;
    }

    /**
     * 其他预授权费用
     * @return other_freeze_amount 其他预授权费用
     */
    public BigDecimal getOtherFreezeAmount() {
        return otherFreezeAmount;
    }

    /**
     * 其他预授权费用
     * @param otherFreezeAmount 其他预授权费用
     */
    public void setOtherFreezeAmount(BigDecimal otherFreezeAmount) {
        this.otherFreezeAmount = otherFreezeAmount;
    }

    /**
     * 附加费用
     * @return additional_amount 附加费用
     */
    public BigDecimal getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * 附加费用
     * @param additionalAmount 附加费用
     */
    public void setAdditionalAmount(BigDecimal additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    /**
     * 是否退还租金:1-是,2-否
     * @return return_rent 是否退还租金:1-是,2-否
     */
    public Integer getReturnRent() {
        return returnRent;
    }

    /**
     * 是否退还租金:1-是,2-否
     * @param returnRent 是否退还租金:1-是,2-否
     */
    public void setReturnRent(Integer returnRent) {
        this.returnRent = returnRent;
    }

    /**
     * 保证金
     * @return margin 保证金
     */
    public BigDecimal getMargin() {
        return margin;
    }

    /**
     * 保证金
     * @param margin 保证金
     */
    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    /**
     * 保证金退还状态：0-未扣保证金（预授权）,1-未退还，2-已退还
     * @return return_margin 保证金退还状态：0-未扣保证金（预授权）,1-未退还，2-已退还
     */
    public Integer getReturnMargin() {
        return returnMargin;
    }

    /**
     * 保证金退还状态：0-未扣保证金（预授权）,1-未退还，2-已退还
     * @param returnMargin 保证金退还状态：0-未扣保证金（预授权）,1-未退还，2-已退还
     */
    public void setReturnMargin(Integer returnMargin) {
        this.returnMargin = returnMargin;
    }

    /**
     * 保证金退还时间
     * @return return_margin_time 保证金退还时间
     */
    public Date getReturnMarginTime() {
        return returnMarginTime;
    }

    /**
     * 保证金退还时间
     * @param returnMarginTime 保证金退还时间
     */
    public void setReturnMarginTime(Date returnMarginTime) {
        this.returnMarginTime = returnMarginTime;
    }

    /**
     * 取车店铺code
     * @return drive_shop_code 取车店铺code
     */
    public String getDriveShopCode() {
        return driveShopCode;
    }

    /**
     * 取车店铺code
     * @param driveShopCode 取车店铺code
     */
    public void setDriveShopCode(String driveShopCode) {
        this.driveShopCode = driveShopCode == null ? null : driveShopCode.trim();
    }

    /**
     * 取车店铺名称
     * @return drive_shop_name 取车店铺名称
     */
    public String getDriveShopName() {
        return driveShopName;
    }

    /**
     * 取车店铺名称
     * @param driveShopName 取车店铺名称
     */
    public void setDriveShopName(String driveShopName) {
        this.driveShopName = driveShopName == null ? null : driveShopName.trim();
    }

    /**
     * 取车地址
     * @return pick_address 取车地址
     */
    public String getPickAddress() {
        return pickAddress;
    }

    /**
     * 取车地址
     * @param pickAddress 取车地址
     */
    public void setPickAddress(String pickAddress) {
        this.pickAddress = pickAddress == null ? null : pickAddress.trim();
    }

    /**
     * 还车门店代码
     * @return return_shop_code 还车门店代码
     */
    public String getReturnShopCode() {
        return returnShopCode;
    }

    /**
     * 还车门店代码
     * @param returnShopCode 还车门店代码
     */
    public void setReturnShopCode(String returnShopCode) {
        this.returnShopCode = returnShopCode == null ? null : returnShopCode.trim();
    }

    /**
     * 还车门店名称
     * @return return_shop_name 还车门店名称
     */
    public String getReturnShopName() {
        return returnShopName;
    }

    /**
     * 还车门店名称
     * @param returnShopName 还车门店名称
     */
    public void setReturnShopName(String returnShopName) {
        this.returnShopName = returnShopName == null ? null : returnShopName.trim();
    }

    /**
     * 还车地址
     * @return return_address 还车地址
     */
    public String getReturnAddress() {
        return returnAddress;
    }

    /**
     * 还车地址
     * @param returnAddress 还车地址
     */
    public void setReturnAddress(String returnAddress) {
        this.returnAddress = returnAddress == null ? null : returnAddress.trim();
    }

    /**
     * 车牌
     * @return license_plate 车牌
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * 车牌
     * @param licensePlate 车牌
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate == null ? null : licensePlate.trim();
    }

    /**
     * 停车位
     * @return park_place 停车位
     */
    public String getParkPlace() {
        return parkPlace;
    }

    /**
     * 停车位
     * @param parkPlace 停车位
     */
    public void setParkPlace(String parkPlace) {
        this.parkPlace = parkPlace == null ? null : parkPlace.trim();
    }

    /**
     * 钥匙柜抽屉号
     * @return key_drawer_code 钥匙柜抽屉号
     */
    public String getKeyDrawerCode() {
        return keyDrawerCode;
    }

    /**
     * 钥匙柜抽屉号
     * @param keyDrawerCode 钥匙柜抽屉号
     */
    public void setKeyDrawerCode(String keyDrawerCode) {
        this.keyDrawerCode = keyDrawerCode == null ? null : keyDrawerCode.trim();
    }

    /**
     * 钥匙柜号
     * @return key_cabinet_code 钥匙柜号
     */
    public String getKeyCabinetCode() {
        return keyCabinetCode;
    }

    /**
     * 钥匙柜号
     * @param keyCabinetCode 钥匙柜号
     */
    public void setKeyCabinetCode(String keyCabinetCode) {
        this.keyCabinetCode = keyCabinetCode == null ? null : keyCabinetCode.trim();
    }

    /**
     * 取车日
     * @return pick_day 取车日
     */
    public Date getPickDay() {
        return pickDay;
    }

    /**
     * 取车日
     * @param pickDay 取车日
     */
    public void setPickDay(Date pickDay) {
        this.pickDay = pickDay;
    }

    /**
     * 取车时间,上午，下午
     * @return pick_time 取车时间,上午，下午
     */
    public String getPickTime() {
        return pickTime;
    }

    /**
     * 取车时间,上午，下午
     * @param pickTime 取车时间,上午，下午
     */
    public void setPickTime(String pickTime) {
        this.pickTime = pickTime == null ? null : pickTime.trim();
    }

    /**
     * 实际取车时间
     * @return real_pick_time 实际取车时间
     */
    public Date getRealPickTime() {
        return realPickTime;
    }

    /**
     * 实际取车时间
     * @param realPickTime 实际取车时间
     */
    public void setRealPickTime(Date realPickTime) {
        this.realPickTime = realPickTime;
    }

    /**
     * 还车日，还车时间
     * @return return_time 还车日，还车时间
     */
    public Date getReturnTime() {
        return returnTime;
    }

    /**
     * 还车日，还车时间
     * @param returnTime 还车日，还车时间
     */
    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * 实际还车时间
     * @return real_return_time 实际还车时间
     */
    public Date getRealReturnTime() {
        return realReturnTime;
    }

    /**
     * 实际还车时间
     * @param realReturnTime 实际还车时间
     */
    public void setRealReturnTime(Date realReturnTime) {
        this.realReturnTime = realReturnTime;
    }

    /**
     * 订单来源：1-支付宝,2-活动，3-淘宝
     * @return order_from 订单来源：1-支付宝,2-活动，3-淘宝
     */
    public Integer getOrderFrom() {
        return orderFrom;
    }

    /**
     * 订单来源：1-支付宝,2-活动，3-淘宝
     * @param orderFrom 订单来源：1-支付宝,2-活动，3-淘宝
     */
    public void setOrderFrom(Integer orderFrom) {
        this.orderFrom = orderFrom;
    }

    /**
     * 取消原因:1-客户时间安排有变,2-想要体验其他车型,3-不想试驾了,4-已经买车，不需要试驾;5-具体其他原因
     * @return cancel_reason 取消原因:1-客户时间安排有变,2-想要体验其他车型,3-不想试驾了,4-已经买车，不需要试驾;5-具体其他原因
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * 取消原因:1-客户时间安排有变,2-想要体验其他车型,3-不想试驾了,4-已经买车，不需要试驾;5-具体其他原因
     * @param cancelReason 取消原因:1-客户时间安排有变,2-想要体验其他车型,3-不想试驾了,4-已经买车，不需要试驾;5-具体其他原因
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    /**
     * 创建时间
     * @return date_create 创建时间
     */
    public Date getDateCreate() {
        return dateCreate;
    }

    /**
     * 创建时间
     * @param dateCreate 创建时间
     */
    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    /**
     * 修改时间
     * @return date_update 修改时间
     */
    public Date getDateUpdate() {
        return dateUpdate;
    }

    /**
     * 修改时间
     * @param dateUpdate 修改时间
     */
    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    /**
     * 删除时间
     * @return date_delete 删除时间
     */
    public Date getDateDelete() {
        return dateDelete;
    }

    /**
     * 删除时间
     * @param dateDelete 删除时间
     */
    public void setDateDelete(Date dateDelete) {
        this.dateDelete = dateDelete;
    }

    /**
     * 创建人
     * @return creator 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 修改人
     * @return modifier 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 商户请求流水号
     * @return order_request_no 商户请求流水号
     */
    public String getOrderRequestNo() {
        return orderRequestNo;
    }

    /**
     * 商户请求流水号
     * @param orderRequestNo 商户请求流水号
     */
    public void setOrderRequestNo(String orderRequestNo) {
        this.orderRequestNo = orderRequestNo == null ? null : orderRequestNo.trim();
    }

    /**
     * 关联用户id
     * @return user_id 关联用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 关联用户id
     * @param userId 关联用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 开始授权时间
     * @return begin_auth_time 开始授权时间
     */
    public Date getBeginAuthTime() {
        return beginAuthTime;
    }

    /**
     * 开始授权时间
     * @param beginAuthTime 开始授权时间
     */
    public void setBeginAuthTime(Date beginAuthTime) {
        this.beginAuthTime = beginAuthTime;
    }

    /**
     * 订单关闭时间
     * @return cancel_time 订单关闭时间
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 订单关闭时间
     * @param cancelTime 订单关闭时间
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * 支付有效时间
     * @return pay_valid_time 支付有效时间
     */
    public Date getPayValidTime() {
        return payValidTime;
    }

    /**
     * 支付有效时间
     * @param payValidTime 支付有效时间
     */
    public void setPayValidTime(Date payValidTime) {
        this.payValidTime = payValidTime;
    }

    /**
     * 其他预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     * @return other_freeze_amount_status 其他预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     */
    public String getOtherFreezeAmountStatus() {
        return otherFreezeAmountStatus;
    }

    /**
     * 其他预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     * @param otherFreezeAmountStatus 其他预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     */
    public void setOtherFreezeAmountStatus(String otherFreezeAmountStatus) {
        this.otherFreezeAmountStatus = otherFreezeAmountStatus == null ? null : otherFreezeAmountStatus.trim();
    }

    /**
     * 违章预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     * @return illegal_freeze_amount_status 违章预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     */
    public String getIllegalFreezeAmountStatus() {
        return illegalFreezeAmountStatus;
    }

    /**
     * 违章预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     * @param illegalFreezeAmountStatus 违章预授权费用状态 NOTAUTHORIZED ：未授权    AUTHORIZED ：已授权。 SETTLED：已结算
     */
    public void setIllegalFreezeAmountStatus(String illegalFreezeAmountStatus) {
        this.illegalFreezeAmountStatus = illegalFreezeAmountStatus == null ? null : illegalFreezeAmountStatus.trim();
    }

    /**
     * 附加费用的状态 ：NOTPAY：未支付  PAID：已支付
     * @return additional_amount_status 附加费用的状态 ：NOTPAY：未支付  PAID：已支付
     */
    public String getAdditionalAmountStatus() {
        return additionalAmountStatus;
    }

    /**
     * 附加费用的状态 ：NOTPAY：未支付  PAID：已支付
     * @param additionalAmountStatus 附加费用的状态 ：NOTPAY：未支付  PAID：已支付
     */
    public void setAdditionalAmountStatus(String additionalAmountStatus) {
        this.additionalAmountStatus = additionalAmountStatus == null ? null : additionalAmountStatus.trim();
    }

    /**
     * 还车验车员
     * @return return_car_inspection_staff 还车验车员
     */
    public String getReturnCarInspectionStaff() {
        return returnCarInspectionStaff;
    }

    /**
     * 还车验车员
     * @param returnCarInspectionStaff 还车验车员
     */
    public void setReturnCarInspectionStaff(String returnCarInspectionStaff) {
        this.returnCarInspectionStaff = returnCarInspectionStaff == null ? null : returnCarInspectionStaff.trim();
    }

    /**
     * 提车验车员
     * @return pick_car_inspection_staff 提车验车员
     */
    public String getPickCarInspectionStaff() {
        return pickCarInspectionStaff;
    }

    /**
     * 提车验车员
     * @param pickCarInspectionStaff 提车验车员
     */
    public void setPickCarInspectionStaff(String pickCarInspectionStaff) {
        this.pickCarInspectionStaff = pickCarInspectionStaff == null ? null : pickCarInspectionStaff.trim();
    }

    /**
     * 是否有购车意愿 T：有意愿 F：没有意愿
     * @return is_willing_buy_car 是否有购车意愿 T：有意愿 F：没有意愿
     */
    public String getIsWillingBuyCar() {
        return isWillingBuyCar;
    }

    /**
     * 是否有购车意愿 T：有意愿 F：没有意愿
     * @param isWillingBuyCar 是否有购车意愿 T：有意愿 F：没有意愿
     */
    public void setIsWillingBuyCar(String isWillingBuyCar) {
        this.isWillingBuyCar = isWillingBuyCar == null ? null : isWillingBuyCar.trim();
    }

    /**
     * 还车时油量
     * @return return_car_oil_mass_cell 还车时油量
     */
    public Integer getReturnCarOilMassCell() {
        return returnCarOilMassCell;
    }

    /**
     * 还车时油量
     * @param returnCarOilMassCell 还车时油量
     */
    public void setReturnCarOilMassCell(Integer returnCarOilMassCell) {
        this.returnCarOilMassCell = returnCarOilMassCell;
    }

    /**
     * 提车时油表格数（一共16格）
     * @return pick_car_oil_mass_cell 提车时油表格数（一共16格）
     */
    public Integer getPickCarOilMassCell() {
        return pickCarOilMassCell;
    }

    /**
     * 提车时油表格数（一共16格）
     * @param pickCarOilMassCell 提车时油表格数（一共16格）
     */
    public void setPickCarOilMassCell(Integer pickCarOilMassCell) {
        this.pickCarOilMassCell = pickCarOilMassCell;
    }

    /**
     * 是否人脸识别  T是  F否
     * @return is_face_recognition 是否人脸识别  T是  F否
     */
    public String getIsFaceRecognition() {
        return isFaceRecognition;
    }

    /**
     * 是否人脸识别  T是  F否
     * @param isFaceRecognition 是否人脸识别  T是  F否
     */
    public void setIsFaceRecognition(String isFaceRecognition) {
        this.isFaceRecognition = isFaceRecognition == null ? null : isFaceRecognition.trim();
    }

    /**
     * 还车区域
     * @return return_park_place 还车区域
     */
    public String getReturnParkPlace() {
        return returnParkPlace;
    }

    /**
     * 还车区域
     * @param returnParkPlace 还车区域
     */
    public void setReturnParkPlace(String returnParkPlace) {
        this.returnParkPlace = returnParkPlace == null ? null : returnParkPlace.trim();
    }

    /**
     * 实际意向金
     * @return actual_margin 实际意向金
     */
    public BigDecimal getActualMargin() {
        return actualMargin;
    }

    /**
     * 实际意向金
     * @param actualMargin 实际意向金
     */
    public void setActualMargin(BigDecimal actualMargin) {
        this.actualMargin = actualMargin;
    }

    /**
     * 实际租金
     * @return actual_rent 实际租金
     */
    public BigDecimal getActualRent() {
        return actualRent;
    }

    /**
     * 实际租金
     * @param actualRent 实际租金
     */
    public void setActualRent(BigDecimal actualRent) {
        this.actualRent = actualRent;
    }

    /**
     * 芝麻分数
     * @return zhima_score 芝麻分数
     */
    public Integer getZhimaScore() {
        return zhimaScore;
    }

    /**
     * 芝麻分数
     * @param zhimaScore 芝麻分数
     */
    public void setZhimaScore(Integer zhimaScore) {
        this.zhimaScore = zhimaScore;
    }
}