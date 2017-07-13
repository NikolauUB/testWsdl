/**
 * LineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution;

public class LineItem  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String cohortId;

    private java.lang.String customerMaterialNumber;

    private java.lang.String examEndDateTime;

    private java.lang.String examStartDateTime;

    private java.lang.String examVersion;

    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Price[] itemPrice;

    private java.lang.String itemTypeUsage;

    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Learner[] learners;

    private java.lang.String lineItemDefine1;

    private java.lang.String lineItemDefine2;

    private java.lang.String lineItemDefine3;

    private java.lang.String lineItemDefine4;

    private java.lang.String lineItemDefine5;

    private java.lang.String lineItemNo;

    private java.lang.String material;

    private java.lang.String materialEntered;

    private java.lang.String materialGroup;

    private java.lang.String materialGroup1;

    private java.lang.String materialGroup2;

    private java.lang.String materialGroup3;

    private java.lang.String materialGroup4;

    private java.lang.String materialGroup5;

    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Partner[] partners;

    private java.lang.String pricingRefMaterial;

    private java.lang.String pricingRefProductCode;

    private java.lang.String productCode;

    private java.lang.String productDesc;

    private java.lang.String quantity;

    private java.lang.String regEndDate;

    private java.lang.String regStartDate;

    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Remark[][] remarks;

    private java.lang.String soldToPOItemNo;

    private java.lang.String soldToPONo;

    private java.lang.String soldToPoDate;

    private java.lang.String soldToPoMethod;

    private java.lang.String soldToPoRef;

    private java.lang.String status;

    private java.lang.String unitofMeasure;

    private java.lang.String usageIndicator;

    public LineItem() {
    }

    public LineItem(
           java.lang.String action,
           java.lang.String cohortId,
           java.lang.String customerMaterialNumber,
           java.lang.String examEndDateTime,
           java.lang.String examStartDateTime,
           java.lang.String examVersion,
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Price[] itemPrice,
           java.lang.String itemTypeUsage,
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Learner[] learners,
           java.lang.String lineItemDefine1,
           java.lang.String lineItemDefine2,
           java.lang.String lineItemDefine3,
           java.lang.String lineItemDefine4,
           java.lang.String lineItemDefine5,
           java.lang.String lineItemNo,
           java.lang.String material,
           java.lang.String materialEntered,
           java.lang.String materialGroup,
           java.lang.String materialGroup1,
           java.lang.String materialGroup2,
           java.lang.String materialGroup3,
           java.lang.String materialGroup4,
           java.lang.String materialGroup5,
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Partner[] partners,
           java.lang.String pricingRefMaterial,
           java.lang.String pricingRefProductCode,
           java.lang.String productCode,
           java.lang.String productDesc,
           java.lang.String quantity,
           java.lang.String regEndDate,
           java.lang.String regStartDate,
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Remark[][] remarks,
           java.lang.String soldToPOItemNo,
           java.lang.String soldToPONo,
           java.lang.String soldToPoDate,
           java.lang.String soldToPoMethod,
           java.lang.String soldToPoRef,
           java.lang.String status,
           java.lang.String unitofMeasure,
           java.lang.String usageIndicator) {
           this.action = action;
           this.cohortId = cohortId;
           this.customerMaterialNumber = customerMaterialNumber;
           this.examEndDateTime = examEndDateTime;
           this.examStartDateTime = examStartDateTime;
           this.examVersion = examVersion;
           this.itemPrice = itemPrice;
           this.itemTypeUsage = itemTypeUsage;
           this.learners = learners;
           this.lineItemDefine1 = lineItemDefine1;
           this.lineItemDefine2 = lineItemDefine2;
           this.lineItemDefine3 = lineItemDefine3;
           this.lineItemDefine4 = lineItemDefine4;
           this.lineItemDefine5 = lineItemDefine5;
           this.lineItemNo = lineItemNo;
           this.material = material;
           this.materialEntered = materialEntered;
           this.materialGroup = materialGroup;
           this.materialGroup1 = materialGroup1;
           this.materialGroup2 = materialGroup2;
           this.materialGroup3 = materialGroup3;
           this.materialGroup4 = materialGroup4;
           this.materialGroup5 = materialGroup5;
           this.partners = partners;
           this.pricingRefMaterial = pricingRefMaterial;
           this.pricingRefProductCode = pricingRefProductCode;
           this.productCode = productCode;
           this.productDesc = productDesc;
           this.quantity = quantity;
           this.regEndDate = regEndDate;
           this.regStartDate = regStartDate;
           this.remarks = remarks;
           this.soldToPOItemNo = soldToPOItemNo;
           this.soldToPONo = soldToPONo;
           this.soldToPoDate = soldToPoDate;
           this.soldToPoMethod = soldToPoMethod;
           this.soldToPoRef = soldToPoRef;
           this.status = status;
           this.unitofMeasure = unitofMeasure;
           this.usageIndicator = usageIndicator;
    }


    /**
     * Gets the action value for this LineItem.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this LineItem.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the cohortId value for this LineItem.
     * 
     * @return cohortId
     */
    public java.lang.String getCohortId() {
        return cohortId;
    }


    /**
     * Sets the cohortId value for this LineItem.
     * 
     * @param cohortId
     */
    public void setCohortId(java.lang.String cohortId) {
        this.cohortId = cohortId;
    }


    /**
     * Gets the customerMaterialNumber value for this LineItem.
     * 
     * @return customerMaterialNumber
     */
    public java.lang.String getCustomerMaterialNumber() {
        return customerMaterialNumber;
    }


    /**
     * Sets the customerMaterialNumber value for this LineItem.
     * 
     * @param customerMaterialNumber
     */
    public void setCustomerMaterialNumber(java.lang.String customerMaterialNumber) {
        this.customerMaterialNumber = customerMaterialNumber;
    }


    /**
     * Gets the examEndDateTime value for this LineItem.
     * 
     * @return examEndDateTime
     */
    public java.lang.String getExamEndDateTime() {
        return examEndDateTime;
    }


    /**
     * Sets the examEndDateTime value for this LineItem.
     * 
     * @param examEndDateTime
     */
    public void setExamEndDateTime(java.lang.String examEndDateTime) {
        this.examEndDateTime = examEndDateTime;
    }


    /**
     * Gets the examStartDateTime value for this LineItem.
     * 
     * @return examStartDateTime
     */
    public java.lang.String getExamStartDateTime() {
        return examStartDateTime;
    }


    /**
     * Sets the examStartDateTime value for this LineItem.
     * 
     * @param examStartDateTime
     */
    public void setExamStartDateTime(java.lang.String examStartDateTime) {
        this.examStartDateTime = examStartDateTime;
    }


    /**
     * Gets the examVersion value for this LineItem.
     * 
     * @return examVersion
     */
    public java.lang.String getExamVersion() {
        return examVersion;
    }


    /**
     * Sets the examVersion value for this LineItem.
     * 
     * @param examVersion
     */
    public void setExamVersion(java.lang.String examVersion) {
        this.examVersion = examVersion;
    }


    /**
     * Gets the itemPrice value for this LineItem.
     * 
     * @return itemPrice
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Price[] getItemPrice() {
        return itemPrice;
    }


    /**
     * Sets the itemPrice value for this LineItem.
     * 
     * @param itemPrice
     */
    public void setItemPrice(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Price[] itemPrice) {
        this.itemPrice = itemPrice;
    }


    /**
     * Gets the itemTypeUsage value for this LineItem.
     * 
     * @return itemTypeUsage
     */
    public java.lang.String getItemTypeUsage() {
        return itemTypeUsage;
    }


    /**
     * Sets the itemTypeUsage value for this LineItem.
     * 
     * @param itemTypeUsage
     */
    public void setItemTypeUsage(java.lang.String itemTypeUsage) {
        this.itemTypeUsage = itemTypeUsage;
    }


    /**
     * Gets the learners value for this LineItem.
     * 
     * @return learners
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Learner[] getLearners() {
        return learners;
    }


    /**
     * Sets the learners value for this LineItem.
     * 
     * @param learners
     */
    public void setLearners(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Learner[] learners) {
        this.learners = learners;
    }


    /**
     * Gets the lineItemDefine1 value for this LineItem.
     * 
     * @return lineItemDefine1
     */
    public java.lang.String getLineItemDefine1() {
        return lineItemDefine1;
    }


    /**
     * Sets the lineItemDefine1 value for this LineItem.
     * 
     * @param lineItemDefine1
     */
    public void setLineItemDefine1(java.lang.String lineItemDefine1) {
        this.lineItemDefine1 = lineItemDefine1;
    }


    /**
     * Gets the lineItemDefine2 value for this LineItem.
     * 
     * @return lineItemDefine2
     */
    public java.lang.String getLineItemDefine2() {
        return lineItemDefine2;
    }


    /**
     * Sets the lineItemDefine2 value for this LineItem.
     * 
     * @param lineItemDefine2
     */
    public void setLineItemDefine2(java.lang.String lineItemDefine2) {
        this.lineItemDefine2 = lineItemDefine2;
    }


    /**
     * Gets the lineItemDefine3 value for this LineItem.
     * 
     * @return lineItemDefine3
     */
    public java.lang.String getLineItemDefine3() {
        return lineItemDefine3;
    }


    /**
     * Sets the lineItemDefine3 value for this LineItem.
     * 
     * @param lineItemDefine3
     */
    public void setLineItemDefine3(java.lang.String lineItemDefine3) {
        this.lineItemDefine3 = lineItemDefine3;
    }


    /**
     * Gets the lineItemDefine4 value for this LineItem.
     * 
     * @return lineItemDefine4
     */
    public java.lang.String getLineItemDefine4() {
        return lineItemDefine4;
    }


    /**
     * Sets the lineItemDefine4 value for this LineItem.
     * 
     * @param lineItemDefine4
     */
    public void setLineItemDefine4(java.lang.String lineItemDefine4) {
        this.lineItemDefine4 = lineItemDefine4;
    }


    /**
     * Gets the lineItemDefine5 value for this LineItem.
     * 
     * @return lineItemDefine5
     */
    public java.lang.String getLineItemDefine5() {
        return lineItemDefine5;
    }


    /**
     * Sets the lineItemDefine5 value for this LineItem.
     * 
     * @param lineItemDefine5
     */
    public void setLineItemDefine5(java.lang.String lineItemDefine5) {
        this.lineItemDefine5 = lineItemDefine5;
    }


    /**
     * Gets the lineItemNo value for this LineItem.
     * 
     * @return lineItemNo
     */
    public java.lang.String getLineItemNo() {
        return lineItemNo;
    }


    /**
     * Sets the lineItemNo value for this LineItem.
     * 
     * @param lineItemNo
     */
    public void setLineItemNo(java.lang.String lineItemNo) {
        this.lineItemNo = lineItemNo;
    }


    /**
     * Gets the material value for this LineItem.
     * 
     * @return material
     */
    public java.lang.String getMaterial() {
        return material;
    }


    /**
     * Sets the material value for this LineItem.
     * 
     * @param material
     */
    public void setMaterial(java.lang.String material) {
        this.material = material;
    }


    /**
     * Gets the materialEntered value for this LineItem.
     * 
     * @return materialEntered
     */
    public java.lang.String getMaterialEntered() {
        return materialEntered;
    }


    /**
     * Sets the materialEntered value for this LineItem.
     * 
     * @param materialEntered
     */
    public void setMaterialEntered(java.lang.String materialEntered) {
        this.materialEntered = materialEntered;
    }


    /**
     * Gets the materialGroup value for this LineItem.
     * 
     * @return materialGroup
     */
    public java.lang.String getMaterialGroup() {
        return materialGroup;
    }


    /**
     * Sets the materialGroup value for this LineItem.
     * 
     * @param materialGroup
     */
    public void setMaterialGroup(java.lang.String materialGroup) {
        this.materialGroup = materialGroup;
    }


    /**
     * Gets the materialGroup1 value for this LineItem.
     * 
     * @return materialGroup1
     */
    public java.lang.String getMaterialGroup1() {
        return materialGroup1;
    }


    /**
     * Sets the materialGroup1 value for this LineItem.
     * 
     * @param materialGroup1
     */
    public void setMaterialGroup1(java.lang.String materialGroup1) {
        this.materialGroup1 = materialGroup1;
    }


    /**
     * Gets the materialGroup2 value for this LineItem.
     * 
     * @return materialGroup2
     */
    public java.lang.String getMaterialGroup2() {
        return materialGroup2;
    }


    /**
     * Sets the materialGroup2 value for this LineItem.
     * 
     * @param materialGroup2
     */
    public void setMaterialGroup2(java.lang.String materialGroup2) {
        this.materialGroup2 = materialGroup2;
    }


    /**
     * Gets the materialGroup3 value for this LineItem.
     * 
     * @return materialGroup3
     */
    public java.lang.String getMaterialGroup3() {
        return materialGroup3;
    }


    /**
     * Sets the materialGroup3 value for this LineItem.
     * 
     * @param materialGroup3
     */
    public void setMaterialGroup3(java.lang.String materialGroup3) {
        this.materialGroup3 = materialGroup3;
    }


    /**
     * Gets the materialGroup4 value for this LineItem.
     * 
     * @return materialGroup4
     */
    public java.lang.String getMaterialGroup4() {
        return materialGroup4;
    }


    /**
     * Sets the materialGroup4 value for this LineItem.
     * 
     * @param materialGroup4
     */
    public void setMaterialGroup4(java.lang.String materialGroup4) {
        this.materialGroup4 = materialGroup4;
    }


    /**
     * Gets the materialGroup5 value for this LineItem.
     * 
     * @return materialGroup5
     */
    public java.lang.String getMaterialGroup5() {
        return materialGroup5;
    }


    /**
     * Sets the materialGroup5 value for this LineItem.
     * 
     * @param materialGroup5
     */
    public void setMaterialGroup5(java.lang.String materialGroup5) {
        this.materialGroup5 = materialGroup5;
    }


    /**
     * Gets the partners value for this LineItem.
     * 
     * @return partners
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Partner[] getPartners() {
        return partners;
    }


    /**
     * Sets the partners value for this LineItem.
     * 
     * @param partners
     */
    public void setPartners(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Partner[] partners) {
        this.partners = partners;
    }


    /**
     * Gets the pricingRefMaterial value for this LineItem.
     * 
     * @return pricingRefMaterial
     */
    public java.lang.String getPricingRefMaterial() {
        return pricingRefMaterial;
    }


    /**
     * Sets the pricingRefMaterial value for this LineItem.
     * 
     * @param pricingRefMaterial
     */
    public void setPricingRefMaterial(java.lang.String pricingRefMaterial) {
        this.pricingRefMaterial = pricingRefMaterial;
    }


    /**
     * Gets the pricingRefProductCode value for this LineItem.
     * 
     * @return pricingRefProductCode
     */
    public java.lang.String getPricingRefProductCode() {
        return pricingRefProductCode;
    }


    /**
     * Sets the pricingRefProductCode value for this LineItem.
     * 
     * @param pricingRefProductCode
     */
    public void setPricingRefProductCode(java.lang.String pricingRefProductCode) {
        this.pricingRefProductCode = pricingRefProductCode;
    }


    /**
     * Gets the productCode value for this LineItem.
     * 
     * @return productCode
     */
    public java.lang.String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this LineItem.
     * 
     * @param productCode
     */
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productDesc value for this LineItem.
     * 
     * @return productDesc
     */
    public java.lang.String getProductDesc() {
        return productDesc;
    }


    /**
     * Sets the productDesc value for this LineItem.
     * 
     * @param productDesc
     */
    public void setProductDesc(java.lang.String productDesc) {
        this.productDesc = productDesc;
    }


    /**
     * Gets the quantity value for this LineItem.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this LineItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the regEndDate value for this LineItem.
     * 
     * @return regEndDate
     */
    public java.lang.String getRegEndDate() {
        return regEndDate;
    }


    /**
     * Sets the regEndDate value for this LineItem.
     * 
     * @param regEndDate
     */
    public void setRegEndDate(java.lang.String regEndDate) {
        this.regEndDate = regEndDate;
    }


    /**
     * Gets the regStartDate value for this LineItem.
     * 
     * @return regStartDate
     */
    public java.lang.String getRegStartDate() {
        return regStartDate;
    }


    /**
     * Sets the regStartDate value for this LineItem.
     * 
     * @param regStartDate
     */
    public void setRegStartDate(java.lang.String regStartDate) {
        this.regStartDate = regStartDate;
    }


    /**
     * Gets the remarks value for this LineItem.
     * 
     * @return remarks
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Remark[][] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this LineItem.
     * 
     * @param remarks
     */
    public void setRemarks(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Remark[][] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the soldToPOItemNo value for this LineItem.
     * 
     * @return soldToPOItemNo
     */
    public java.lang.String getSoldToPOItemNo() {
        return soldToPOItemNo;
    }


    /**
     * Sets the soldToPOItemNo value for this LineItem.
     * 
     * @param soldToPOItemNo
     */
    public void setSoldToPOItemNo(java.lang.String soldToPOItemNo) {
        this.soldToPOItemNo = soldToPOItemNo;
    }


    /**
     * Gets the soldToPONo value for this LineItem.
     * 
     * @return soldToPONo
     */
    public java.lang.String getSoldToPONo() {
        return soldToPONo;
    }


    /**
     * Sets the soldToPONo value for this LineItem.
     * 
     * @param soldToPONo
     */
    public void setSoldToPONo(java.lang.String soldToPONo) {
        this.soldToPONo = soldToPONo;
    }


    /**
     * Gets the soldToPoDate value for this LineItem.
     * 
     * @return soldToPoDate
     */
    public java.lang.String getSoldToPoDate() {
        return soldToPoDate;
    }


    /**
     * Sets the soldToPoDate value for this LineItem.
     * 
     * @param soldToPoDate
     */
    public void setSoldToPoDate(java.lang.String soldToPoDate) {
        this.soldToPoDate = soldToPoDate;
    }


    /**
     * Gets the soldToPoMethod value for this LineItem.
     * 
     * @return soldToPoMethod
     */
    public java.lang.String getSoldToPoMethod() {
        return soldToPoMethod;
    }


    /**
     * Sets the soldToPoMethod value for this LineItem.
     * 
     * @param soldToPoMethod
     */
    public void setSoldToPoMethod(java.lang.String soldToPoMethod) {
        this.soldToPoMethod = soldToPoMethod;
    }


    /**
     * Gets the soldToPoRef value for this LineItem.
     * 
     * @return soldToPoRef
     */
    public java.lang.String getSoldToPoRef() {
        return soldToPoRef;
    }


    /**
     * Sets the soldToPoRef value for this LineItem.
     * 
     * @param soldToPoRef
     */
    public void setSoldToPoRef(java.lang.String soldToPoRef) {
        this.soldToPoRef = soldToPoRef;
    }


    /**
     * Gets the status value for this LineItem.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LineItem.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the unitofMeasure value for this LineItem.
     * 
     * @return unitofMeasure
     */
    public java.lang.String getUnitofMeasure() {
        return unitofMeasure;
    }


    /**
     * Sets the unitofMeasure value for this LineItem.
     * 
     * @param unitofMeasure
     */
    public void setUnitofMeasure(java.lang.String unitofMeasure) {
        this.unitofMeasure = unitofMeasure;
    }


    /**
     * Gets the usageIndicator value for this LineItem.
     * 
     * @return usageIndicator
     */
    public java.lang.String getUsageIndicator() {
        return usageIndicator;
    }


    /**
     * Sets the usageIndicator value for this LineItem.
     * 
     * @param usageIndicator
     */
    public void setUsageIndicator(java.lang.String usageIndicator) {
        this.usageIndicator = usageIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItem)) return false;
        LineItem other = (LineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.cohortId==null && other.getCohortId()==null) || 
             (this.cohortId!=null &&
              this.cohortId.equals(other.getCohortId()))) &&
            ((this.customerMaterialNumber==null && other.getCustomerMaterialNumber()==null) || 
             (this.customerMaterialNumber!=null &&
              this.customerMaterialNumber.equals(other.getCustomerMaterialNumber()))) &&
            ((this.examEndDateTime==null && other.getExamEndDateTime()==null) || 
             (this.examEndDateTime!=null &&
              this.examEndDateTime.equals(other.getExamEndDateTime()))) &&
            ((this.examStartDateTime==null && other.getExamStartDateTime()==null) || 
             (this.examStartDateTime!=null &&
              this.examStartDateTime.equals(other.getExamStartDateTime()))) &&
            ((this.examVersion==null && other.getExamVersion()==null) || 
             (this.examVersion!=null &&
              this.examVersion.equals(other.getExamVersion()))) &&
            ((this.itemPrice==null && other.getItemPrice()==null) || 
             (this.itemPrice!=null &&
              java.util.Arrays.equals(this.itemPrice, other.getItemPrice()))) &&
            ((this.itemTypeUsage==null && other.getItemTypeUsage()==null) || 
             (this.itemTypeUsage!=null &&
              this.itemTypeUsage.equals(other.getItemTypeUsage()))) &&
            ((this.learners==null && other.getLearners()==null) || 
             (this.learners!=null &&
              java.util.Arrays.equals(this.learners, other.getLearners()))) &&
            ((this.lineItemDefine1==null && other.getLineItemDefine1()==null) || 
             (this.lineItemDefine1!=null &&
              this.lineItemDefine1.equals(other.getLineItemDefine1()))) &&
            ((this.lineItemDefine2==null && other.getLineItemDefine2()==null) || 
             (this.lineItemDefine2!=null &&
              this.lineItemDefine2.equals(other.getLineItemDefine2()))) &&
            ((this.lineItemDefine3==null && other.getLineItemDefine3()==null) || 
             (this.lineItemDefine3!=null &&
              this.lineItemDefine3.equals(other.getLineItemDefine3()))) &&
            ((this.lineItemDefine4==null && other.getLineItemDefine4()==null) || 
             (this.lineItemDefine4!=null &&
              this.lineItemDefine4.equals(other.getLineItemDefine4()))) &&
            ((this.lineItemDefine5==null && other.getLineItemDefine5()==null) || 
             (this.lineItemDefine5!=null &&
              this.lineItemDefine5.equals(other.getLineItemDefine5()))) &&
            ((this.lineItemNo==null && other.getLineItemNo()==null) || 
             (this.lineItemNo!=null &&
              this.lineItemNo.equals(other.getLineItemNo()))) &&
            ((this.material==null && other.getMaterial()==null) || 
             (this.material!=null &&
              this.material.equals(other.getMaterial()))) &&
            ((this.materialEntered==null && other.getMaterialEntered()==null) || 
             (this.materialEntered!=null &&
              this.materialEntered.equals(other.getMaterialEntered()))) &&
            ((this.materialGroup==null && other.getMaterialGroup()==null) || 
             (this.materialGroup!=null &&
              this.materialGroup.equals(other.getMaterialGroup()))) &&
            ((this.materialGroup1==null && other.getMaterialGroup1()==null) || 
             (this.materialGroup1!=null &&
              this.materialGroup1.equals(other.getMaterialGroup1()))) &&
            ((this.materialGroup2==null && other.getMaterialGroup2()==null) || 
             (this.materialGroup2!=null &&
              this.materialGroup2.equals(other.getMaterialGroup2()))) &&
            ((this.materialGroup3==null && other.getMaterialGroup3()==null) || 
             (this.materialGroup3!=null &&
              this.materialGroup3.equals(other.getMaterialGroup3()))) &&
            ((this.materialGroup4==null && other.getMaterialGroup4()==null) || 
             (this.materialGroup4!=null &&
              this.materialGroup4.equals(other.getMaterialGroup4()))) &&
            ((this.materialGroup5==null && other.getMaterialGroup5()==null) || 
             (this.materialGroup5!=null &&
              this.materialGroup5.equals(other.getMaterialGroup5()))) &&
            ((this.partners==null && other.getPartners()==null) || 
             (this.partners!=null &&
              java.util.Arrays.equals(this.partners, other.getPartners()))) &&
            ((this.pricingRefMaterial==null && other.getPricingRefMaterial()==null) || 
             (this.pricingRefMaterial!=null &&
              this.pricingRefMaterial.equals(other.getPricingRefMaterial()))) &&
            ((this.pricingRefProductCode==null && other.getPricingRefProductCode()==null) || 
             (this.pricingRefProductCode!=null &&
              this.pricingRefProductCode.equals(other.getPricingRefProductCode()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productDesc==null && other.getProductDesc()==null) || 
             (this.productDesc!=null &&
              this.productDesc.equals(other.getProductDesc()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.regEndDate==null && other.getRegEndDate()==null) || 
             (this.regEndDate!=null &&
              this.regEndDate.equals(other.getRegEndDate()))) &&
            ((this.regStartDate==null && other.getRegStartDate()==null) || 
             (this.regStartDate!=null &&
              this.regStartDate.equals(other.getRegStartDate()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.soldToPOItemNo==null && other.getSoldToPOItemNo()==null) || 
             (this.soldToPOItemNo!=null &&
              this.soldToPOItemNo.equals(other.getSoldToPOItemNo()))) &&
            ((this.soldToPONo==null && other.getSoldToPONo()==null) || 
             (this.soldToPONo!=null &&
              this.soldToPONo.equals(other.getSoldToPONo()))) &&
            ((this.soldToPoDate==null && other.getSoldToPoDate()==null) || 
             (this.soldToPoDate!=null &&
              this.soldToPoDate.equals(other.getSoldToPoDate()))) &&
            ((this.soldToPoMethod==null && other.getSoldToPoMethod()==null) || 
             (this.soldToPoMethod!=null &&
              this.soldToPoMethod.equals(other.getSoldToPoMethod()))) &&
            ((this.soldToPoRef==null && other.getSoldToPoRef()==null) || 
             (this.soldToPoRef!=null &&
              this.soldToPoRef.equals(other.getSoldToPoRef()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.unitofMeasure==null && other.getUnitofMeasure()==null) || 
             (this.unitofMeasure!=null &&
              this.unitofMeasure.equals(other.getUnitofMeasure()))) &&
            ((this.usageIndicator==null && other.getUsageIndicator()==null) || 
             (this.usageIndicator!=null &&
              this.usageIndicator.equals(other.getUsageIndicator())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getCohortId() != null) {
            _hashCode += getCohortId().hashCode();
        }
        if (getCustomerMaterialNumber() != null) {
            _hashCode += getCustomerMaterialNumber().hashCode();
        }
        if (getExamEndDateTime() != null) {
            _hashCode += getExamEndDateTime().hashCode();
        }
        if (getExamStartDateTime() != null) {
            _hashCode += getExamStartDateTime().hashCode();
        }
        if (getExamVersion() != null) {
            _hashCode += getExamVersion().hashCode();
        }
        if (getItemPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemTypeUsage() != null) {
            _hashCode += getItemTypeUsage().hashCode();
        }
        if (getLearners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLearners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLearners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineItemDefine1() != null) {
            _hashCode += getLineItemDefine1().hashCode();
        }
        if (getLineItemDefine2() != null) {
            _hashCode += getLineItemDefine2().hashCode();
        }
        if (getLineItemDefine3() != null) {
            _hashCode += getLineItemDefine3().hashCode();
        }
        if (getLineItemDefine4() != null) {
            _hashCode += getLineItemDefine4().hashCode();
        }
        if (getLineItemDefine5() != null) {
            _hashCode += getLineItemDefine5().hashCode();
        }
        if (getLineItemNo() != null) {
            _hashCode += getLineItemNo().hashCode();
        }
        if (getMaterial() != null) {
            _hashCode += getMaterial().hashCode();
        }
        if (getMaterialEntered() != null) {
            _hashCode += getMaterialEntered().hashCode();
        }
        if (getMaterialGroup() != null) {
            _hashCode += getMaterialGroup().hashCode();
        }
        if (getMaterialGroup1() != null) {
            _hashCode += getMaterialGroup1().hashCode();
        }
        if (getMaterialGroup2() != null) {
            _hashCode += getMaterialGroup2().hashCode();
        }
        if (getMaterialGroup3() != null) {
            _hashCode += getMaterialGroup3().hashCode();
        }
        if (getMaterialGroup4() != null) {
            _hashCode += getMaterialGroup4().hashCode();
        }
        if (getMaterialGroup5() != null) {
            _hashCode += getMaterialGroup5().hashCode();
        }
        if (getPartners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricingRefMaterial() != null) {
            _hashCode += getPricingRefMaterial().hashCode();
        }
        if (getPricingRefProductCode() != null) {
            _hashCode += getPricingRefProductCode().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductDesc() != null) {
            _hashCode += getProductDesc().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRegEndDate() != null) {
            _hashCode += getRegEndDate().hashCode();
        }
        if (getRegStartDate() != null) {
            _hashCode += getRegStartDate().hashCode();
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoldToPOItemNo() != null) {
            _hashCode += getSoldToPOItemNo().hashCode();
        }
        if (getSoldToPONo() != null) {
            _hashCode += getSoldToPONo().hashCode();
        }
        if (getSoldToPoDate() != null) {
            _hashCode += getSoldToPoDate().hashCode();
        }
        if (getSoldToPoMethod() != null) {
            _hashCode += getSoldToPoMethod().hashCode();
        }
        if (getSoldToPoRef() != null) {
            _hashCode += getSoldToPoRef().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUnitofMeasure() != null) {
            _hashCode += getUnitofMeasure().hashCode();
        }
        if (getUsageIndicator() != null) {
            _hashCode += getUsageIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "LineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cohortId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CohortId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerMaterialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CustomerMaterialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ExamEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examStartDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ExamStartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ExamVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ItemPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Price"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTypeUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ItemTypeUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("learners");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Learners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Learner"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Learner"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemDefine1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "LineItemDefine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemDefine2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "LineItemDefine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemDefine3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "LineItemDefine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemDefine4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "LineItemDefine4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemDefine5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "LineItemDefine5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "LineItemNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("material");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Material"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialEntered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "MaterialEntered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "MaterialGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialGroup1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "MaterialGroup1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialGroup2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "MaterialGroup2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialGroup3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "MaterialGroup3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialGroup4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "MaterialGroup4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialGroup5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "MaterialGroup5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partners");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Partners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Partner"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Partner"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingRefMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "PricingRefMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingRefProductCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "PricingRefProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ProductDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "RegEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "RegStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ArrayOfRemark"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ArrayOfRemark"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToPOItemNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "SoldToPOItemNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToPONo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "SoldToPONo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToPoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "SoldToPoDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToPoMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "SoldToPoMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToPoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "SoldToPoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitofMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "UnitofMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "UsageIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
