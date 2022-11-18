package edu.lfsfxy.customer.entity;


public class BaseDict {

  private String dictId;
  private String dictTypeCode;
  private String dictTypeName;
  private String dictItemName;
  private String dictItemCode;
  private int dictSort;
  private String dictEnable;
  private String dictMemo;

  @Override
  public String toString() {
    return "BaseDict{" + "dictId='" + dictId + '\'' + ", dictTypeCode='" + dictTypeCode + '\'' + ", dictTypeName='" + dictTypeName + '\'' + ", dictItemName='" + dictItemName + '\'' + ", dictItemCode='" + dictItemCode + '\'' + ", dictSort=" + dictSort + ", dictEnable='" + dictEnable + '\'' + ", dictMemo='" + dictMemo + '\'' + '}';
  }

  public String getDictId() {
    return dictId;
  }

  public void setDictId(String dictId) {
    this.dictId = dictId;
  }


  public String getDictTypeCode() {
    return dictTypeCode;
  }

  public void setDictTypeCode(String dictTypeCode) {
    this.dictTypeCode = dictTypeCode;
  }


  public String getDictTypeName() {
    return dictTypeName;
  }

  public void setDictTypeName(String dictTypeName) {
    this.dictTypeName = dictTypeName;
  }


  public String getDictItemName() {
    return dictItemName;
  }

  public void setDictItemName(String dictItemName) {
    this.dictItemName = dictItemName;
  }


  public String getDictItemCode() {
    return dictItemCode;
  }

  public void setDictItemCode(String dictItemCode) {
    this.dictItemCode = dictItemCode;
  }


  public int getDictSort() {
    return dictSort;
  }

  public void setDictSort(int dictSort) {
    this.dictSort = dictSort;
  }

  public String getDictEnable() {
    return dictEnable;
  }

  public void setDictEnable(String dictEnable) {
    this.dictEnable = dictEnable;
  }


  public String getDictMemo() {
    return dictMemo;
  }

  public void setDictMemo(String dictMemo) {
    this.dictMemo = dictMemo;
  }

}
