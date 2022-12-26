// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package net.cloudcentrik.autolink.common.proto;

/**
 * Protobuf enum {@code command.CommandType}
 */
public enum CommandType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>IMPORT_PRODUCT = 0;</code>
   */
  IMPORT_PRODUCT(0),
  /**
   * <code>EXPORT_PRODUCT = 1;</code>
   */
  EXPORT_PRODUCT(1),
  /**
   * <code>IMPORT_ORDER = 2;</code>
   */
  IMPORT_ORDER(2),
  /**
   * <code>EXPORT_ORDER = 3;</code>
   */
  EXPORT_ORDER(3),
  /**
   * <code>IMPORT_CUSTOMER = 4;</code>
   */
  IMPORT_CUSTOMER(4),
  /**
   * <code>EXPORT_CUSTOMER = 5;</code>
   */
  EXPORT_CUSTOMER(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>IMPORT_PRODUCT = 0;</code>
   */
  public static final int IMPORT_PRODUCT_VALUE = 0;
  /**
   * <code>EXPORT_PRODUCT = 1;</code>
   */
  public static final int EXPORT_PRODUCT_VALUE = 1;
  /**
   * <code>IMPORT_ORDER = 2;</code>
   */
  public static final int IMPORT_ORDER_VALUE = 2;
  /**
   * <code>EXPORT_ORDER = 3;</code>
   */
  public static final int EXPORT_ORDER_VALUE = 3;
  /**
   * <code>IMPORT_CUSTOMER = 4;</code>
   */
  public static final int IMPORT_CUSTOMER_VALUE = 4;
  /**
   * <code>EXPORT_CUSTOMER = 5;</code>
   */
  public static final int EXPORT_CUSTOMER_VALUE = 5;


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
  public static CommandType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CommandType forNumber(int value) {
    switch (value) {
      case 0: return IMPORT_PRODUCT;
      case 1: return EXPORT_PRODUCT;
      case 2: return IMPORT_ORDER;
      case 3: return EXPORT_ORDER;
      case 4: return IMPORT_CUSTOMER;
      case 5: return EXPORT_CUSTOMER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CommandType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CommandType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CommandType>() {
          public CommandType findValueByNumber(int number) {
            return CommandType.forNumber(number);
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
    return net.cloudcentrik.autolink.common.proto.CommandProtos.getDescriptor().getEnumTypes().get(1);
  }

  private static final CommandType[] VALUES = values();

  public static CommandType valueOf(
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

  private CommandType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:command.CommandType)
}
