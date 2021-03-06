package com.alag.test.business.module.message.api.model;

import java.io.Serializable;
import java.util.Date;

public class TransactionMessage implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.id
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.version
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.editor
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String editor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.creater
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.edit_time
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private Date editTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.create_time
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.message_id
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String messageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.message_data_type
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String messageDataType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.consumer_queue
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String consumerQueue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.message_send_times
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private Integer messageSendTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.areadly_dead
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String areadlyDead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.status
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.remark
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.field1
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String field1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.field2
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String field2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.field3
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String field3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_message.message_body
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    private String messageBody;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.id
     *
     * @return the value of transaction_message.id
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.id
     *
     * @param id the value for transaction_message.id
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.version
     *
     * @return the value of transaction_message.version
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.version
     *
     * @param version the value for transaction_message.version
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.editor
     *
     * @return the value of transaction_message.editor
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getEditor() {
        return editor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.editor
     *
     * @param editor the value for transaction_message.editor
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.creater
     *
     * @return the value of transaction_message.creater
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.creater
     *
     * @param creater the value for transaction_message.creater
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.edit_time
     *
     * @return the value of transaction_message.edit_time
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public Date getEditTime() {
        return editTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.edit_time
     *
     * @param editTime the value for transaction_message.edit_time
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.create_time
     *
     * @return the value of transaction_message.create_time
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.create_time
     *
     * @param createTime the value for transaction_message.create_time
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.message_id
     *
     * @return the value of transaction_message.message_id
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.message_id
     *
     * @param messageId the value for transaction_message.message_id
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.message_data_type
     *
     * @return the value of transaction_message.message_data_type
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getMessageDataType() {
        return messageDataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.message_data_type
     *
     * @param messageDataType the value for transaction_message.message_data_type
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setMessageDataType(String messageDataType) {
        this.messageDataType = messageDataType == null ? null : messageDataType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.consumer_queue
     *
     * @return the value of transaction_message.consumer_queue
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getConsumerQueue() {
        return consumerQueue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.consumer_queue
     *
     * @param consumerQueue the value for transaction_message.consumer_queue
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setConsumerQueue(String consumerQueue) {
        this.consumerQueue = consumerQueue == null ? null : consumerQueue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.message_send_times
     *
     * @return the value of transaction_message.message_send_times
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public Integer getMessageSendTimes() {
        return messageSendTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.message_send_times
     *
     * @param messageSendTimes the value for transaction_message.message_send_times
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setMessageSendTimes(Integer messageSendTimes) {
        this.messageSendTimes = messageSendTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.areadly_dead
     *
     * @return the value of transaction_message.areadly_dead
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getAreadlyDead() {
        return areadlyDead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.areadly_dead
     *
     * @param areadlyDead the value for transaction_message.areadly_dead
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setAreadlyDead(String areadlyDead) {
        this.areadlyDead = areadlyDead == null ? null : areadlyDead.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.status
     *
     * @return the value of transaction_message.status
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.status
     *
     * @param status the value for transaction_message.status
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.remark
     *
     * @return the value of transaction_message.remark
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.remark
     *
     * @param remark the value for transaction_message.remark
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.field1
     *
     * @return the value of transaction_message.field1
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.field1
     *
     * @param field1 the value for transaction_message.field1
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.field2
     *
     * @return the value of transaction_message.field2
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.field2
     *
     * @param field2 the value for transaction_message.field2
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.field3
     *
     * @return the value of transaction_message.field3
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getField3() {
        return field3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.field3
     *
     * @param field3 the value for transaction_message.field3
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_message.message_body
     *
     * @return the value of transaction_message.message_body
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_message.message_body
     *
     * @param messageBody the value for transaction_message.message_body
     *
     * @mbggenerated Wed Feb 27 23:29:24 CST 2019
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody == null ? null : messageBody.trim();
    }
}