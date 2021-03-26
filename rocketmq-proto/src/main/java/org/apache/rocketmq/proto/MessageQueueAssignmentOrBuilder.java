// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rocketmq.proto

package org.apache.rocketmq.proto;

public interface MessageQueueAssignmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rocketmq.rpc.api.MessageQueueAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rocketmq.rpc.api.MessageQueue message_queue = 1;</code>
   * @return Whether the messageQueue field is set.
   */
  boolean hasMessageQueue();
  /**
   * <code>.rocketmq.rpc.api.MessageQueue message_queue = 1;</code>
   * @return The messageQueue.
   */
  org.apache.rocketmq.proto.MessageQueue getMessageQueue();
  /**
   * <code>.rocketmq.rpc.api.MessageQueue message_queue = 1;</code>
   */
  org.apache.rocketmq.proto.MessageQueueOrBuilder getMessageQueueOrBuilder();

  /**
   * <code>.rocketmq.rpc.api.MessageRequestMode mode = 2;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.rocketmq.rpc.api.MessageRequestMode mode = 2;</code>
   * @return The mode.
   */
  org.apache.rocketmq.proto.MessageRequestMode getMode();

  /**
   * <code>map&lt;string, string&gt; attachments = 3;</code>
   */
  int getAttachmentsCount();
  /**
   * <code>map&lt;string, string&gt; attachments = 3;</code>
   */
  boolean containsAttachments(
      java.lang.String key);
  /**
   * Use {@link #getAttachmentsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttachments();
  /**
   * <code>map&lt;string, string&gt; attachments = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttachmentsMap();
  /**
   * <code>map&lt;string, string&gt; attachments = 3;</code>
   */

  java.lang.String getAttachmentsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attachments = 3;</code>
   */

  java.lang.String getAttachmentsOrThrow(
      java.lang.String key);
}
