// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package net.cloudcentrik.autolink.common.proto;

/**
 * Protobuf type {@code command.CommandResponse}
 */
public  final class CommandResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:command.CommandResponse)
    CommandResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommandResponse.newBuilder() to construct.
  private CommandResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommandResponse() {
    commandId_ = "";
    commandStatus_ = 0;
    serverInfo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommandResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommandResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            commandId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            commandStatus_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            serverInfo_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.cloudcentrik.autolink.common.proto.CommandProtos.internal_static_command_CommandResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.cloudcentrik.autolink.common.proto.CommandProtos.internal_static_command_CommandResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.cloudcentrik.autolink.common.proto.CommandResponse.class, net.cloudcentrik.autolink.common.proto.CommandResponse.Builder.class);
  }

  public static final int COMMANDID_FIELD_NUMBER = 1;
  private volatile java.lang.Object commandId_;
  /**
   * <code>string commandId = 1;</code>
   * @return The commandId.
   */
  public java.lang.String getCommandId() {
    java.lang.Object ref = commandId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      commandId_ = s;
      return s;
    }
  }
  /**
   * <code>string commandId = 1;</code>
   * @return The bytes for commandId.
   */
  public com.google.protobuf.ByteString
      getCommandIdBytes() {
    java.lang.Object ref = commandId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      commandId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMANDSTATUS_FIELD_NUMBER = 2;
  private int commandStatus_;
  /**
   * <code>.command.CommandStatus commandStatus = 2;</code>
   * @return The enum numeric value on the wire for commandStatus.
   */
  public int getCommandStatusValue() {
    return commandStatus_;
  }
  /**
   * <code>.command.CommandStatus commandStatus = 2;</code>
   * @return The commandStatus.
   */
  public net.cloudcentrik.autolink.common.proto.CommandStatus getCommandStatus() {
    @SuppressWarnings("deprecation")
    net.cloudcentrik.autolink.common.proto.CommandStatus result = net.cloudcentrik.autolink.common.proto.CommandStatus.valueOf(commandStatus_);
    return result == null ? net.cloudcentrik.autolink.common.proto.CommandStatus.UNRECOGNIZED : result;
  }

  public static final int SERVERINFO_FIELD_NUMBER = 3;
  private volatile java.lang.Object serverInfo_;
  /**
   * <code>string serverInfo = 3;</code>
   * @return The serverInfo.
   */
  public java.lang.String getServerInfo() {
    java.lang.Object ref = serverInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serverInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string serverInfo = 3;</code>
   * @return The bytes for serverInfo.
   */
  public com.google.protobuf.ByteString
      getServerInfoBytes() {
    java.lang.Object ref = serverInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serverInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCommandIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, commandId_);
    }
    if (commandStatus_ != net.cloudcentrik.autolink.common.proto.CommandStatus.STARTED.getNumber()) {
      output.writeEnum(2, commandStatus_);
    }
    if (!getServerInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, serverInfo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCommandIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, commandId_);
    }
    if (commandStatus_ != net.cloudcentrik.autolink.common.proto.CommandStatus.STARTED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, commandStatus_);
    }
    if (!getServerInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, serverInfo_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.cloudcentrik.autolink.common.proto.CommandResponse)) {
      return super.equals(obj);
    }
    net.cloudcentrik.autolink.common.proto.CommandResponse other = (net.cloudcentrik.autolink.common.proto.CommandResponse) obj;

    if (!getCommandId()
        .equals(other.getCommandId())) return false;
    if (commandStatus_ != other.commandStatus_) return false;
    if (!getServerInfo()
        .equals(other.getServerInfo())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COMMANDID_FIELD_NUMBER;
    hash = (53 * hash) + getCommandId().hashCode();
    hash = (37 * hash) + COMMANDSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + commandStatus_;
    hash = (37 * hash) + SERVERINFO_FIELD_NUMBER;
    hash = (53 * hash) + getServerInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.cloudcentrik.autolink.common.proto.CommandResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.cloudcentrik.autolink.common.proto.CommandResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code command.CommandResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:command.CommandResponse)
      net.cloudcentrik.autolink.common.proto.CommandResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.cloudcentrik.autolink.common.proto.CommandProtos.internal_static_command_CommandResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.cloudcentrik.autolink.common.proto.CommandProtos.internal_static_command_CommandResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.cloudcentrik.autolink.common.proto.CommandResponse.class, net.cloudcentrik.autolink.common.proto.CommandResponse.Builder.class);
    }

    // Construct using net.cloudcentrik.autolink.common.proto.CommandResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      commandId_ = "";

      commandStatus_ = 0;

      serverInfo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.cloudcentrik.autolink.common.proto.CommandProtos.internal_static_command_CommandResponse_descriptor;
    }

    @java.lang.Override
    public net.cloudcentrik.autolink.common.proto.CommandResponse getDefaultInstanceForType() {
      return net.cloudcentrik.autolink.common.proto.CommandResponse.getDefaultInstance();
    }

    @java.lang.Override
    public net.cloudcentrik.autolink.common.proto.CommandResponse build() {
      net.cloudcentrik.autolink.common.proto.CommandResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.cloudcentrik.autolink.common.proto.CommandResponse buildPartial() {
      net.cloudcentrik.autolink.common.proto.CommandResponse result = new net.cloudcentrik.autolink.common.proto.CommandResponse(this);
      result.commandId_ = commandId_;
      result.commandStatus_ = commandStatus_;
      result.serverInfo_ = serverInfo_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.cloudcentrik.autolink.common.proto.CommandResponse) {
        return mergeFrom((net.cloudcentrik.autolink.common.proto.CommandResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.cloudcentrik.autolink.common.proto.CommandResponse other) {
      if (other == net.cloudcentrik.autolink.common.proto.CommandResponse.getDefaultInstance()) return this;
      if (!other.getCommandId().isEmpty()) {
        commandId_ = other.commandId_;
        onChanged();
      }
      if (other.commandStatus_ != 0) {
        setCommandStatusValue(other.getCommandStatusValue());
      }
      if (!other.getServerInfo().isEmpty()) {
        serverInfo_ = other.serverInfo_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      net.cloudcentrik.autolink.common.proto.CommandResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.cloudcentrik.autolink.common.proto.CommandResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object commandId_ = "";
    /**
     * <code>string commandId = 1;</code>
     * @return The commandId.
     */
    public java.lang.String getCommandId() {
      java.lang.Object ref = commandId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        commandId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string commandId = 1;</code>
     * @return The bytes for commandId.
     */
    public com.google.protobuf.ByteString
        getCommandIdBytes() {
      java.lang.Object ref = commandId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        commandId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string commandId = 1;</code>
     * @param value The commandId to set.
     * @return This builder for chaining.
     */
    public Builder setCommandId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      commandId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string commandId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommandId() {
      
      commandId_ = getDefaultInstance().getCommandId();
      onChanged();
      return this;
    }
    /**
     * <code>string commandId = 1;</code>
     * @param value The bytes for commandId to set.
     * @return This builder for chaining.
     */
    public Builder setCommandIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      commandId_ = value;
      onChanged();
      return this;
    }

    private int commandStatus_ = 0;
    /**
     * <code>.command.CommandStatus commandStatus = 2;</code>
     * @return The enum numeric value on the wire for commandStatus.
     */
    public int getCommandStatusValue() {
      return commandStatus_;
    }
    /**
     * <code>.command.CommandStatus commandStatus = 2;</code>
     * @param value The enum numeric value on the wire for commandStatus to set.
     * @return This builder for chaining.
     */
    public Builder setCommandStatusValue(int value) {
      commandStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.command.CommandStatus commandStatus = 2;</code>
     * @return The commandStatus.
     */
    public net.cloudcentrik.autolink.common.proto.CommandStatus getCommandStatus() {
      @SuppressWarnings("deprecation")
      net.cloudcentrik.autolink.common.proto.CommandStatus result = net.cloudcentrik.autolink.common.proto.CommandStatus.valueOf(commandStatus_);
      return result == null ? net.cloudcentrik.autolink.common.proto.CommandStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.command.CommandStatus commandStatus = 2;</code>
     * @param value The commandStatus to set.
     * @return This builder for chaining.
     */
    public Builder setCommandStatus(net.cloudcentrik.autolink.common.proto.CommandStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      commandStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.command.CommandStatus commandStatus = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommandStatus() {
      
      commandStatus_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object serverInfo_ = "";
    /**
     * <code>string serverInfo = 3;</code>
     * @return The serverInfo.
     */
    public java.lang.String getServerInfo() {
      java.lang.Object ref = serverInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string serverInfo = 3;</code>
     * @return The bytes for serverInfo.
     */
    public com.google.protobuf.ByteString
        getServerInfoBytes() {
      java.lang.Object ref = serverInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string serverInfo = 3;</code>
     * @param value The serverInfo to set.
     * @return This builder for chaining.
     */
    public Builder setServerInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serverInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string serverInfo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearServerInfo() {
      
      serverInfo_ = getDefaultInstance().getServerInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string serverInfo = 3;</code>
     * @param value The bytes for serverInfo to set.
     * @return This builder for chaining.
     */
    public Builder setServerInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serverInfo_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:command.CommandResponse)
  }

  // @@protoc_insertion_point(class_scope:command.CommandResponse)
  private static final net.cloudcentrik.autolink.common.proto.CommandResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.cloudcentrik.autolink.common.proto.CommandResponse();
  }

  public static net.cloudcentrik.autolink.common.proto.CommandResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommandResponse>
      PARSER = new com.google.protobuf.AbstractParser<CommandResponse>() {
    @java.lang.Override
    public CommandResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommandResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommandResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommandResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.cloudcentrik.autolink.common.proto.CommandResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
