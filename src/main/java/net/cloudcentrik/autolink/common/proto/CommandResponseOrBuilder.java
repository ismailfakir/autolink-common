// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package net.cloudcentrik.autolink.common.proto;

public interface CommandResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:command.CommandResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string commandId = 1;</code>
   * @return The commandId.
   */
  java.lang.String getCommandId();
  /**
   * <code>string commandId = 1;</code>
   * @return The bytes for commandId.
   */
  com.google.protobuf.ByteString
      getCommandIdBytes();

  /**
   * <code>.command.CommandStatus commandStatus = 2;</code>
   * @return The enum numeric value on the wire for commandStatus.
   */
  int getCommandStatusValue();
  /**
   * <code>.command.CommandStatus commandStatus = 2;</code>
   * @return The commandStatus.
   */
  net.cloudcentrik.autolink.common.proto.CommandStatus getCommandStatus();

  /**
   * <code>string serverInfo = 3;</code>
   * @return The serverInfo.
   */
  java.lang.String getServerInfo();
  /**
   * <code>string serverInfo = 3;</code>
   * @return The bytes for serverInfo.
   */
  com.google.protobuf.ByteString
      getServerInfoBytes();
}
