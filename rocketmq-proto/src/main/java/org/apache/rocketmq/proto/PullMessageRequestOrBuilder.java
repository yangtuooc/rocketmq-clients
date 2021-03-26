// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rocketmq.proto

package org.apache.rocketmq.proto;

public interface PullMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rocketmq.rpc.api.PullMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string broker_name = 1;</code>
   * @return The brokerName.
   */
  java.lang.String getBrokerName();
  /**
   * <code>string broker_name = 1;</code>
   * @return The bytes for brokerName.
   */
  com.google.protobuf.ByteString
      getBrokerNameBytes();

  /**
   * <code>string topic = 2;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 2;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>string consumer_group = 3;</code>
   * @return The consumerGroup.
   */
  java.lang.String getConsumerGroup();
  /**
   * <code>string consumer_group = 3;</code>
   * @return The bytes for consumerGroup.
   */
  com.google.protobuf.ByteString
      getConsumerGroupBytes();

  /**
   * <code>int32 queue_id = 4;</code>
   * @return The queueId.
   */
  int getQueueId();

  /**
   * <code>int64 queue_offset = 5;</code>
   * @return The queueOffset.
   */
  long getQueueOffset();

  /**
   * <code>int32 max_message_number = 6;</code>
   * @return The maxMessageNumber.
   */
  int getMaxMessageNumber();

  /**
   * <code>int32 system_flag = 7;</code>
   * @return The systemFlag.
   */
  int getSystemFlag();

  /**
   * <code>int64 commit_offset = 8;</code>
   * @return The commitOffset.
   */
  long getCommitOffset();

  /**
   * <code>int64 suspend_timeout_milliseconds = 9;</code>
   * @return The suspendTimeoutMilliseconds.
   */
  long getSuspendTimeoutMilliseconds();

  /**
   * <code>string subscription = 10;</code>
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   * <code>string subscription = 10;</code>
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();

  /**
   * <code>int64 subscription_version = 11;</code>
   * @return The subscriptionVersion.
   */
  long getSubscriptionVersion();

  /**
   * <code>string expression_type = 12;</code>
   * @return The expressionType.
   */
  java.lang.String getExpressionType();
  /**
   * <code>string expression_type = 12;</code>
   * @return The bytes for expressionType.
   */
  com.google.protobuf.ByteString
      getExpressionTypeBytes();

  /**
   * <code>string subscription_properties = 13;</code>
   * @return The subscriptionProperties.
   */
  java.lang.String getSubscriptionProperties();
  /**
   * <code>string subscription_properties = 13;</code>
   * @return The bytes for subscriptionProperties.
   */
  com.google.protobuf.ByteString
      getSubscriptionPropertiesBytes();
}
