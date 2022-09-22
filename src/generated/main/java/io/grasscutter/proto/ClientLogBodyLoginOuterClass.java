// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientLogBodyLogin.proto

package io.grasscutter.proto;

public final class ClientLogBodyLoginOuterClass {
  private ClientLogBodyLoginOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientLogBodyLoginOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientLogBodyLogin)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string action_type = 1;</code>
     * @return The actionType.
     */
    java.lang.String getActionType();
    /**
     * <code>string action_type = 1;</code>
     * @return The bytes for actionType.
     */
    com.google.protobuf.ByteString
        getActionTypeBytes();

    /**
     * <code>string action_result = 2;</code>
     * @return The actionResult.
     */
    java.lang.String getActionResult();
    /**
     * <code>string action_result = 2;</code>
     * @return The bytes for actionResult.
     */
    com.google.protobuf.ByteString
        getActionResultBytes();

    /**
     * <code>uint32 action_time = 3;</code>
     * @return The actionTime.
     */
    int getActionTime();

    /**
     * <code>string xg = 4;</code>
     * @return The xg.
     */
    java.lang.String getXg();
    /**
     * <code>string xg = 4;</code>
     * @return The bytes for xg.
     */
    com.google.protobuf.ByteString
        getXgBytes();

    /**
     * <code>uint32 signal_level = 5;</code>
     * @return The signalLevel.
     */
    int getSignalLevel();

    /**
     * <code>string dns = 6;</code>
     * @return The dns.
     */
    java.lang.String getDns();
    /**
     * <code>string dns = 6;</code>
     * @return The bytes for dns.
     */
    com.google.protobuf.ByteString
        getDnsBytes();
  }
  /**
   * Protobuf type {@code ClientLogBodyLogin}
   */
  public static final class ClientLogBodyLogin extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientLogBodyLogin)
      ClientLogBodyLoginOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientLogBodyLogin.newBuilder() to construct.
    private ClientLogBodyLogin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientLogBodyLogin() {
      actionType_ = "";
      actionResult_ = "";
      xg_ = "";
      dns_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientLogBodyLogin();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientLogBodyLogin(
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

              actionType_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              actionResult_ = s;
              break;
            }
            case 24: {

              actionTime_ = input.readUInt32();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              xg_ = s;
              break;
            }
            case 40: {

              signalLevel_ = input.readUInt32();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              dns_ = s;
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
      return io.grasscutter.proto.ClientLogBodyLoginOuterClass.internal_static_ClientLogBodyLogin_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ClientLogBodyLoginOuterClass.internal_static_ClientLogBodyLogin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin.class, io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin.Builder.class);
    }

    public static final int ACTION_TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object actionType_;
    /**
     * <code>string action_type = 1;</code>
     * @return The actionType.
     */
    @java.lang.Override
    public java.lang.String getActionType() {
      java.lang.Object ref = actionType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionType_ = s;
        return s;
      }
    }
    /**
     * <code>string action_type = 1;</code>
     * @return The bytes for actionType.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getActionTypeBytes() {
      java.lang.Object ref = actionType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ACTION_RESULT_FIELD_NUMBER = 2;
    private volatile java.lang.Object actionResult_;
    /**
     * <code>string action_result = 2;</code>
     * @return The actionResult.
     */
    @java.lang.Override
    public java.lang.String getActionResult() {
      java.lang.Object ref = actionResult_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionResult_ = s;
        return s;
      }
    }
    /**
     * <code>string action_result = 2;</code>
     * @return The bytes for actionResult.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getActionResultBytes() {
      java.lang.Object ref = actionResult_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionResult_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ACTION_TIME_FIELD_NUMBER = 3;
    private int actionTime_;
    /**
     * <code>uint32 action_time = 3;</code>
     * @return The actionTime.
     */
    @java.lang.Override
    public int getActionTime() {
      return actionTime_;
    }

    public static final int XG_FIELD_NUMBER = 4;
    private volatile java.lang.Object xg_;
    /**
     * <code>string xg = 4;</code>
     * @return The xg.
     */
    @java.lang.Override
    public java.lang.String getXg() {
      java.lang.Object ref = xg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        xg_ = s;
        return s;
      }
    }
    /**
     * <code>string xg = 4;</code>
     * @return The bytes for xg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getXgBytes() {
      java.lang.Object ref = xg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        xg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SIGNAL_LEVEL_FIELD_NUMBER = 5;
    private int signalLevel_;
    /**
     * <code>uint32 signal_level = 5;</code>
     * @return The signalLevel.
     */
    @java.lang.Override
    public int getSignalLevel() {
      return signalLevel_;
    }

    public static final int DNS_FIELD_NUMBER = 6;
    private volatile java.lang.Object dns_;
    /**
     * <code>string dns = 6;</code>
     * @return The dns.
     */
    @java.lang.Override
    public java.lang.String getDns() {
      java.lang.Object ref = dns_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dns_ = s;
        return s;
      }
    }
    /**
     * <code>string dns = 6;</code>
     * @return The bytes for dns.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDnsBytes() {
      java.lang.Object ref = dns_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dns_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionType_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, actionType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionResult_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, actionResult_);
      }
      if (actionTime_ != 0) {
        output.writeUInt32(3, actionTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(xg_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, xg_);
      }
      if (signalLevel_ != 0) {
        output.writeUInt32(5, signalLevel_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dns_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, dns_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionType_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, actionType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionResult_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, actionResult_);
      }
      if (actionTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, actionTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(xg_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, xg_);
      }
      if (signalLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, signalLevel_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dns_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, dns_);
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
      if (!(obj instanceof io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin other = (io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin) obj;

      if (!getActionType()
          .equals(other.getActionType())) return false;
      if (!getActionResult()
          .equals(other.getActionResult())) return false;
      if (getActionTime()
          != other.getActionTime()) return false;
      if (!getXg()
          .equals(other.getXg())) return false;
      if (getSignalLevel()
          != other.getSignalLevel()) return false;
      if (!getDns()
          .equals(other.getDns())) return false;
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
      hash = (37 * hash) + ACTION_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getActionType().hashCode();
      hash = (37 * hash) + ACTION_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getActionResult().hashCode();
      hash = (37 * hash) + ACTION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getActionTime();
      hash = (37 * hash) + XG_FIELD_NUMBER;
      hash = (53 * hash) + getXg().hashCode();
      hash = (37 * hash) + SIGNAL_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getSignalLevel();
      hash = (37 * hash) + DNS_FIELD_NUMBER;
      hash = (53 * hash) + getDns().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin prototype) {
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
     * Protobuf type {@code ClientLogBodyLogin}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientLogBodyLogin)
        io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLoginOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ClientLogBodyLoginOuterClass.internal_static_ClientLogBodyLogin_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ClientLogBodyLoginOuterClass.internal_static_ClientLogBodyLogin_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin.class, io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin.Builder.class);
      }

      // Construct using io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin.newBuilder()
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
        actionType_ = "";

        actionResult_ = "";

        actionTime_ = 0;

        xg_ = "";

        signalLevel_ = 0;

        dns_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ClientLogBodyLoginOuterClass.internal_static_ClientLogBodyLogin_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin getDefaultInstanceForType() {
        return io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin build() {
        io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin buildPartial() {
        io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin result = new io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin(this);
        result.actionType_ = actionType_;
        result.actionResult_ = actionResult_;
        result.actionTime_ = actionTime_;
        result.xg_ = xg_;
        result.signalLevel_ = signalLevel_;
        result.dns_ = dns_;
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
        if (other instanceof io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin) {
          return mergeFrom((io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin other) {
        if (other == io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin.getDefaultInstance()) return this;
        if (!other.getActionType().isEmpty()) {
          actionType_ = other.actionType_;
          onChanged();
        }
        if (!other.getActionResult().isEmpty()) {
          actionResult_ = other.actionResult_;
          onChanged();
        }
        if (other.getActionTime() != 0) {
          setActionTime(other.getActionTime());
        }
        if (!other.getXg().isEmpty()) {
          xg_ = other.xg_;
          onChanged();
        }
        if (other.getSignalLevel() != 0) {
          setSignalLevel(other.getSignalLevel());
        }
        if (!other.getDns().isEmpty()) {
          dns_ = other.dns_;
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
        io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object actionType_ = "";
      /**
       * <code>string action_type = 1;</code>
       * @return The actionType.
       */
      public java.lang.String getActionType() {
        java.lang.Object ref = actionType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          actionType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string action_type = 1;</code>
       * @return The bytes for actionType.
       */
      public com.google.protobuf.ByteString
          getActionTypeBytes() {
        java.lang.Object ref = actionType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          actionType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string action_type = 1;</code>
       * @param value The actionType to set.
       * @return This builder for chaining.
       */
      public Builder setActionType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        actionType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string action_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearActionType() {
        
        actionType_ = getDefaultInstance().getActionType();
        onChanged();
        return this;
      }
      /**
       * <code>string action_type = 1;</code>
       * @param value The bytes for actionType to set.
       * @return This builder for chaining.
       */
      public Builder setActionTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        actionType_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object actionResult_ = "";
      /**
       * <code>string action_result = 2;</code>
       * @return The actionResult.
       */
      public java.lang.String getActionResult() {
        java.lang.Object ref = actionResult_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          actionResult_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string action_result = 2;</code>
       * @return The bytes for actionResult.
       */
      public com.google.protobuf.ByteString
          getActionResultBytes() {
        java.lang.Object ref = actionResult_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          actionResult_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string action_result = 2;</code>
       * @param value The actionResult to set.
       * @return This builder for chaining.
       */
      public Builder setActionResult(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        actionResult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string action_result = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearActionResult() {
        
        actionResult_ = getDefaultInstance().getActionResult();
        onChanged();
        return this;
      }
      /**
       * <code>string action_result = 2;</code>
       * @param value The bytes for actionResult to set.
       * @return This builder for chaining.
       */
      public Builder setActionResultBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        actionResult_ = value;
        onChanged();
        return this;
      }

      private int actionTime_ ;
      /**
       * <code>uint32 action_time = 3;</code>
       * @return The actionTime.
       */
      @java.lang.Override
      public int getActionTime() {
        return actionTime_;
      }
      /**
       * <code>uint32 action_time = 3;</code>
       * @param value The actionTime to set.
       * @return This builder for chaining.
       */
      public Builder setActionTime(int value) {
        
        actionTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 action_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearActionTime() {
        
        actionTime_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object xg_ = "";
      /**
       * <code>string xg = 4;</code>
       * @return The xg.
       */
      public java.lang.String getXg() {
        java.lang.Object ref = xg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          xg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string xg = 4;</code>
       * @return The bytes for xg.
       */
      public com.google.protobuf.ByteString
          getXgBytes() {
        java.lang.Object ref = xg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          xg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string xg = 4;</code>
       * @param value The xg to set.
       * @return This builder for chaining.
       */
      public Builder setXg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        xg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string xg = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearXg() {
        
        xg_ = getDefaultInstance().getXg();
        onChanged();
        return this;
      }
      /**
       * <code>string xg = 4;</code>
       * @param value The bytes for xg to set.
       * @return This builder for chaining.
       */
      public Builder setXgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        xg_ = value;
        onChanged();
        return this;
      }

      private int signalLevel_ ;
      /**
       * <code>uint32 signal_level = 5;</code>
       * @return The signalLevel.
       */
      @java.lang.Override
      public int getSignalLevel() {
        return signalLevel_;
      }
      /**
       * <code>uint32 signal_level = 5;</code>
       * @param value The signalLevel to set.
       * @return This builder for chaining.
       */
      public Builder setSignalLevel(int value) {
        
        signalLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 signal_level = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSignalLevel() {
        
        signalLevel_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object dns_ = "";
      /**
       * <code>string dns = 6;</code>
       * @return The dns.
       */
      public java.lang.String getDns() {
        java.lang.Object ref = dns_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          dns_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string dns = 6;</code>
       * @return The bytes for dns.
       */
      public com.google.protobuf.ByteString
          getDnsBytes() {
        java.lang.Object ref = dns_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          dns_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string dns = 6;</code>
       * @param value The dns to set.
       * @return This builder for chaining.
       */
      public Builder setDns(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        dns_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string dns = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDns() {
        
        dns_ = getDefaultInstance().getDns();
        onChanged();
        return this;
      }
      /**
       * <code>string dns = 6;</code>
       * @param value The bytes for dns to set.
       * @return This builder for chaining.
       */
      public Builder setDnsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        dns_ = value;
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


      // @@protoc_insertion_point(builder_scope:ClientLogBodyLogin)
    }

    // @@protoc_insertion_point(class_scope:ClientLogBodyLogin)
    private static final io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin();
    }

    public static io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientLogBodyLogin>
        PARSER = new com.google.protobuf.AbstractParser<ClientLogBodyLogin>() {
      @java.lang.Override
      public ClientLogBodyLogin parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientLogBodyLogin(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientLogBodyLogin> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientLogBodyLogin> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ClientLogBodyLoginOuterClass.ClientLogBodyLogin getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientLogBodyLogin_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientLogBodyLogin_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ClientLogBodyLogin.proto\"\204\001\n\022ClientLog" +
      "BodyLogin\022\023\n\013action_type\030\001 \001(\t\022\025\n\raction" +
      "_result\030\002 \001(\t\022\023\n\013action_time\030\003 \001(\r\022\n\n\002xg" +
      "\030\004 \001(\t\022\024\n\014signal_level\030\005 \001(\r\022\013\n\003dns\030\006 \001(" +
      "\tB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientLogBodyLogin_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientLogBodyLogin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientLogBodyLogin_descriptor,
        new java.lang.String[] { "ActionType", "ActionResult", "ActionTime", "Xg", "SignalLevel", "Dns", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}