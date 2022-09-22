// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAnimatorStateChangedNotify.proto

package io.grasscutter.proto;

public final class EvtAnimatorStateChangedNotifyOuterClass {
  private EvtAnimatorStateChangedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAnimatorStateChangedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAnimatorStateChangedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ForwardType forward_type = 3;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 3;</code>
     * @return The forwardType.
     */
    io.grasscutter.proto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
     * @return Whether the evtAnimatorStateChangedInfo field is set.
     */
    boolean hasEvtAnimatorStateChangedInfo();
    /**
     * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
     * @return The evtAnimatorStateChangedInfo.
     */
    io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo getEvtAnimatorStateChangedInfo();
    /**
     * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
     */
    io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfoOrBuilder getEvtAnimatorStateChangedInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 331
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code EvtAnimatorStateChangedNotify}
   */
  public static final class EvtAnimatorStateChangedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAnimatorStateChangedNotify)
      EvtAnimatorStateChangedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAnimatorStateChangedNotify.newBuilder() to construct.
    private EvtAnimatorStateChangedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAnimatorStateChangedNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAnimatorStateChangedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtAnimatorStateChangedNotify(
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
            case 24: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
              break;
            }
            case 82: {
              io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.Builder subBuilder = null;
              if (evtAnimatorStateChangedInfo_ != null) {
                subBuilder = evtAnimatorStateChangedInfo_.toBuilder();
              }
              evtAnimatorStateChangedInfo_ = input.readMessage(io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(evtAnimatorStateChangedInfo_);
                evtAnimatorStateChangedInfo_ = subBuilder.buildPartial();
              }

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
      return io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.internal_static_EvtAnimatorStateChangedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.internal_static_EvtAnimatorStateChangedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify.class, io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify.Builder.class);
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 3;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 3;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 3;</code>
     * @return The forwardType.
     */
    @java.lang.Override public io.grasscutter.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.ForwardTypeOuterClass.ForwardType result = io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int EVT_ANIMATOR_STATE_CHANGED_INFO_FIELD_NUMBER = 10;
    private io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo evtAnimatorStateChangedInfo_;
    /**
     * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
     * @return Whether the evtAnimatorStateChangedInfo field is set.
     */
    @java.lang.Override
    public boolean hasEvtAnimatorStateChangedInfo() {
      return evtAnimatorStateChangedInfo_ != null;
    }
    /**
     * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
     * @return The evtAnimatorStateChangedInfo.
     */
    @java.lang.Override
    public io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo getEvtAnimatorStateChangedInfo() {
      return evtAnimatorStateChangedInfo_ == null ? io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.getDefaultInstance() : evtAnimatorStateChangedInfo_;
    }
    /**
     * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfoOrBuilder getEvtAnimatorStateChangedInfoOrBuilder() {
      return getEvtAnimatorStateChangedInfo();
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
      if (forwardType_ != io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(3, forwardType_);
      }
      if (evtAnimatorStateChangedInfo_ != null) {
        output.writeMessage(10, getEvtAnimatorStateChangedInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (forwardType_ != io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, forwardType_);
      }
      if (evtAnimatorStateChangedInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getEvtAnimatorStateChangedInfo());
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
      if (!(obj instanceof io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify other = (io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify) obj;

      if (forwardType_ != other.forwardType_) return false;
      if (hasEvtAnimatorStateChangedInfo() != other.hasEvtAnimatorStateChangedInfo()) return false;
      if (hasEvtAnimatorStateChangedInfo()) {
        if (!getEvtAnimatorStateChangedInfo()
            .equals(other.getEvtAnimatorStateChangedInfo())) return false;
      }
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
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      if (hasEvtAnimatorStateChangedInfo()) {
        hash = (37 * hash) + EVT_ANIMATOR_STATE_CHANGED_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEvtAnimatorStateChangedInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify prototype) {
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
     * <pre>
     * CmdId: 331
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code EvtAnimatorStateChangedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAnimatorStateChangedNotify)
        io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.internal_static_EvtAnimatorStateChangedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.internal_static_EvtAnimatorStateChangedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify.class, io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify.newBuilder()
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
        forwardType_ = 0;

        if (evtAnimatorStateChangedInfoBuilder_ == null) {
          evtAnimatorStateChangedInfo_ = null;
        } else {
          evtAnimatorStateChangedInfo_ = null;
          evtAnimatorStateChangedInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.internal_static_EvtAnimatorStateChangedNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify build() {
        io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify buildPartial() {
        io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify result = new io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify(this);
        result.forwardType_ = forwardType_;
        if (evtAnimatorStateChangedInfoBuilder_ == null) {
          result.evtAnimatorStateChangedInfo_ = evtAnimatorStateChangedInfo_;
        } else {
          result.evtAnimatorStateChangedInfo_ = evtAnimatorStateChangedInfoBuilder_.build();
        }
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
        if (other instanceof io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify) {
          return mergeFrom((io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify other) {
        if (other == io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify.getDefaultInstance()) return this;
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.hasEvtAnimatorStateChangedInfo()) {
          mergeEvtAnimatorStateChangedInfo(other.getEvtAnimatorStateChangedInfo());
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
        io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 3;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 3;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 3;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public io.grasscutter.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.ForwardTypeOuterClass.ForwardType result = io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 3;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(io.grasscutter.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo evtAnimatorStateChangedInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo, io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.Builder, io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfoOrBuilder> evtAnimatorStateChangedInfoBuilder_;
      /**
       * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
       * @return Whether the evtAnimatorStateChangedInfo field is set.
       */
      public boolean hasEvtAnimatorStateChangedInfo() {
        return evtAnimatorStateChangedInfoBuilder_ != null || evtAnimatorStateChangedInfo_ != null;
      }
      /**
       * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
       * @return The evtAnimatorStateChangedInfo.
       */
      public io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo getEvtAnimatorStateChangedInfo() {
        if (evtAnimatorStateChangedInfoBuilder_ == null) {
          return evtAnimatorStateChangedInfo_ == null ? io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.getDefaultInstance() : evtAnimatorStateChangedInfo_;
        } else {
          return evtAnimatorStateChangedInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
       */
      public Builder setEvtAnimatorStateChangedInfo(io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo value) {
        if (evtAnimatorStateChangedInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          evtAnimatorStateChangedInfo_ = value;
          onChanged();
        } else {
          evtAnimatorStateChangedInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
       */
      public Builder setEvtAnimatorStateChangedInfo(
          io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.Builder builderForValue) {
        if (evtAnimatorStateChangedInfoBuilder_ == null) {
          evtAnimatorStateChangedInfo_ = builderForValue.build();
          onChanged();
        } else {
          evtAnimatorStateChangedInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
       */
      public Builder mergeEvtAnimatorStateChangedInfo(io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo value) {
        if (evtAnimatorStateChangedInfoBuilder_ == null) {
          if (evtAnimatorStateChangedInfo_ != null) {
            evtAnimatorStateChangedInfo_ =
              io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.newBuilder(evtAnimatorStateChangedInfo_).mergeFrom(value).buildPartial();
          } else {
            evtAnimatorStateChangedInfo_ = value;
          }
          onChanged();
        } else {
          evtAnimatorStateChangedInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
       */
      public Builder clearEvtAnimatorStateChangedInfo() {
        if (evtAnimatorStateChangedInfoBuilder_ == null) {
          evtAnimatorStateChangedInfo_ = null;
          onChanged();
        } else {
          evtAnimatorStateChangedInfo_ = null;
          evtAnimatorStateChangedInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
       */
      public io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.Builder getEvtAnimatorStateChangedInfoBuilder() {
        
        onChanged();
        return getEvtAnimatorStateChangedInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
       */
      public io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfoOrBuilder getEvtAnimatorStateChangedInfoOrBuilder() {
        if (evtAnimatorStateChangedInfoBuilder_ != null) {
          return evtAnimatorStateChangedInfoBuilder_.getMessageOrBuilder();
        } else {
          return evtAnimatorStateChangedInfo_ == null ?
              io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.getDefaultInstance() : evtAnimatorStateChangedInfo_;
        }
      }
      /**
       * <code>.EvtAnimatorStateChangedInfo evt_animator_state_changed_info = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo, io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.Builder, io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfoOrBuilder> 
          getEvtAnimatorStateChangedInfoFieldBuilder() {
        if (evtAnimatorStateChangedInfoBuilder_ == null) {
          evtAnimatorStateChangedInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo, io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.Builder, io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfoOrBuilder>(
                  getEvtAnimatorStateChangedInfo(),
                  getParentForChildren(),
                  isClean());
          evtAnimatorStateChangedInfo_ = null;
        }
        return evtAnimatorStateChangedInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtAnimatorStateChangedNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAnimatorStateChangedNotify)
    private static final io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify();
    }

    public static io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAnimatorStateChangedNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAnimatorStateChangedNotify>() {
      @java.lang.Override
      public EvtAnimatorStateChangedNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtAnimatorStateChangedNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtAnimatorStateChangedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAnimatorStateChangedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.EvtAnimatorStateChangedNotifyOuterClass.EvtAnimatorStateChangedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAnimatorStateChangedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAnimatorStateChangedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#EvtAnimatorStateChangedNotify.proto\032!E" +
      "vtAnimatorStateChangedInfo.proto\032\021Forwar" +
      "dType.proto\"\212\001\n\035EvtAnimatorStateChangedN" +
      "otify\022\"\n\014forward_type\030\003 \001(\0162\014.ForwardTyp" +
      "e\022E\n\037evt_animator_state_changed_info\030\n \001" +
      "(\0132\034.EvtAnimatorStateChangedInfoB\026\n\024io.g" +
      "rasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.getDescriptor(),
          io.grasscutter.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtAnimatorStateChangedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAnimatorStateChangedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAnimatorStateChangedNotify_descriptor,
        new java.lang.String[] { "ForwardType", "EvtAnimatorStateChangedInfo", });
    io.grasscutter.proto.EvtAnimatorStateChangedInfoOuterClass.getDescriptor();
    io.grasscutter.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}