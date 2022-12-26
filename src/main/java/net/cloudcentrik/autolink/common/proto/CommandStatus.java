// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package net.cloudcentrik.autolink.common.proto;

/**
 * Protobuf enum {@code command.CommandStatus}
 */
public enum CommandStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STARTED = 0;</code>
   */
  STARTED(0),
  /**
   * <code>FINISH = 1;</code>
   */
  FINISH(1),
  /**
   * <code>FAILED = 3;</code>
   */
  FAILED(3),
  /**
   * <code>WAITING = 4;</code>
   */
  WAITING(4),
  /**
   * <code>UNKNOWN = 5;</code>
   */
  UNKNOWN(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STARTED = 0;</code>
   */
  public static final int STARTED_VALUE = 0;
  /**
   * <code>FINISH = 1;</code>
   */
  public static final int FINISH_VALUE = 1;
  /**
   * <code>FAILED = 3;</code>
   */
  public static final int FAILED_VALUE = 3;
  /**
   * <code>WAITING = 4;</code>
   */
  public static final int WAITING_VALUE = 4;
  /**
   * <code>UNKNOWN = 5;</code>
   */
  public static final int UNKNOWN_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CommandStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CommandStatus forNumber(int value) {
    switch (value) {
      case 0: return STARTED;
      case 1: return FINISH;
      case 3: return FAILED;
      case 4: return WAITING;
      case 5: return UNKNOWN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CommandStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CommandStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CommandStatus>() {
          public CommandStatus findValueByNumber(int number) {
            return CommandStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return net.cloudcentrik.autolink.common.proto.CommandProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final CommandStatus[] VALUES = values();

  public static CommandStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CommandStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:command.CommandStatus)
}
