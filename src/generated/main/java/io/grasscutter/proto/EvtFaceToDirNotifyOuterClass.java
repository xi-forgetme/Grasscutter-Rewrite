// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtFaceToDirNotify.proto

package io.grasscutter.proto;

public final class EvtFaceToDirNotifyOuterClass {
  private EvtFaceToDirNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtFaceToDirNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtFaceToDirNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ForwardType forward_type = 13;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 13;</code>
     * @return The forwardType.
     */
    io.grasscutter.proto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
     * @return Whether the evtFaceToDirInfo field is set.
     */
    boolean hasEvtFaceToDirInfo();
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
     * @return The evtFaceToDirInfo.
     */
    io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo getEvtFaceToDirInfo();
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
     */
    io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder getEvtFaceToDirInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 390
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code EvtFaceToDirNotify}
   */
  public static final class EvtFaceToDirNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtFaceToDirNotify)
      EvtFaceToDirNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtFaceToDirNotify.newBuilder() to construct.
    private EvtFaceToDirNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtFaceToDirNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtFaceToDirNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtFaceToDirNotify(
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
            case 42: {
              io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder subBuilder = null;
              if (evtFaceToDirInfo_ != null) {
                subBuilder = evtFaceToDirInfo_.toBuilder();
              }
              evtFaceToDirInfo_ = input.readMessage(io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(evtFaceToDirInfo_);
                evtFaceToDirInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 104: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
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
      return io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.class, io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.Builder.class);
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 13;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 13;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 13;</code>
     * @return The forwardType.
     */
    @java.lang.Override public io.grasscutter.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.ForwardTypeOuterClass.ForwardType result = io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int EVT_FACE_TO_DIR_INFO_FIELD_NUMBER = 5;
    private io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo evtFaceToDirInfo_;
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
     * @return Whether the evtFaceToDirInfo field is set.
     */
    @java.lang.Override
    public boolean hasEvtFaceToDirInfo() {
      return evtFaceToDirInfo_ != null;
    }
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
     * @return The evtFaceToDirInfo.
     */
    @java.lang.Override
    public io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo getEvtFaceToDirInfo() {
      return evtFaceToDirInfo_ == null ? io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.getDefaultInstance() : evtFaceToDirInfo_;
    }
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder getEvtFaceToDirInfoOrBuilder() {
      return getEvtFaceToDirInfo();
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
      if (evtFaceToDirInfo_ != null) {
        output.writeMessage(5, getEvtFaceToDirInfo());
      }
      if (forwardType_ != io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(13, forwardType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (evtFaceToDirInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getEvtFaceToDirInfo());
      }
      if (forwardType_ != io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, forwardType_);
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
      if (!(obj instanceof io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify other = (io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify) obj;

      if (forwardType_ != other.forwardType_) return false;
      if (hasEvtFaceToDirInfo() != other.hasEvtFaceToDirInfo()) return false;
      if (hasEvtFaceToDirInfo()) {
        if (!getEvtFaceToDirInfo()
            .equals(other.getEvtFaceToDirInfo())) return false;
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
      if (hasEvtFaceToDirInfo()) {
        hash = (37 * hash) + EVT_FACE_TO_DIR_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEvtFaceToDirInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify prototype) {
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
     * CmdId: 390
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code EvtFaceToDirNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtFaceToDirNotify)
        io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.class, io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.newBuilder()
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

        if (evtFaceToDirInfoBuilder_ == null) {
          evtFaceToDirInfo_ = null;
        } else {
          evtFaceToDirInfo_ = null;
          evtFaceToDirInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify build() {
        io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify buildPartial() {
        io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify result = new io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify(this);
        result.forwardType_ = forwardType_;
        if (evtFaceToDirInfoBuilder_ == null) {
          result.evtFaceToDirInfo_ = evtFaceToDirInfo_;
        } else {
          result.evtFaceToDirInfo_ = evtFaceToDirInfoBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify) {
          return mergeFrom((io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify other) {
        if (other == io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.getDefaultInstance()) return this;
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.hasEvtFaceToDirInfo()) {
          mergeEvtFaceToDirInfo(other.getEvtFaceToDirInfo());
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
        io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify) e.getUnfinishedMessage();
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
       * <code>.ForwardType forward_type = 13;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 13;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 13;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public io.grasscutter.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.ForwardTypeOuterClass.ForwardType result = io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 13;</code>
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
       * <code>.ForwardType forward_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo evtFaceToDirInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo, io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder, io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder> evtFaceToDirInfoBuilder_;
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
       * @return Whether the evtFaceToDirInfo field is set.
       */
      public boolean hasEvtFaceToDirInfo() {
        return evtFaceToDirInfoBuilder_ != null || evtFaceToDirInfo_ != null;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
       * @return The evtFaceToDirInfo.
       */
      public io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo getEvtFaceToDirInfo() {
        if (evtFaceToDirInfoBuilder_ == null) {
          return evtFaceToDirInfo_ == null ? io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.getDefaultInstance() : evtFaceToDirInfo_;
        } else {
          return evtFaceToDirInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
       */
      public Builder setEvtFaceToDirInfo(io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo value) {
        if (evtFaceToDirInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          evtFaceToDirInfo_ = value;
          onChanged();
        } else {
          evtFaceToDirInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
       */
      public Builder setEvtFaceToDirInfo(
          io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder builderForValue) {
        if (evtFaceToDirInfoBuilder_ == null) {
          evtFaceToDirInfo_ = builderForValue.build();
          onChanged();
        } else {
          evtFaceToDirInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
       */
      public Builder mergeEvtFaceToDirInfo(io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo value) {
        if (evtFaceToDirInfoBuilder_ == null) {
          if (evtFaceToDirInfo_ != null) {
            evtFaceToDirInfo_ =
              io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.newBuilder(evtFaceToDirInfo_).mergeFrom(value).buildPartial();
          } else {
            evtFaceToDirInfo_ = value;
          }
          onChanged();
        } else {
          evtFaceToDirInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
       */
      public Builder clearEvtFaceToDirInfo() {
        if (evtFaceToDirInfoBuilder_ == null) {
          evtFaceToDirInfo_ = null;
          onChanged();
        } else {
          evtFaceToDirInfo_ = null;
          evtFaceToDirInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
       */
      public io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder getEvtFaceToDirInfoBuilder() {
        
        onChanged();
        return getEvtFaceToDirInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
       */
      public io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder getEvtFaceToDirInfoOrBuilder() {
        if (evtFaceToDirInfoBuilder_ != null) {
          return evtFaceToDirInfoBuilder_.getMessageOrBuilder();
        } else {
          return evtFaceToDirInfo_ == null ?
              io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.getDefaultInstance() : evtFaceToDirInfo_;
        }
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo, io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder, io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder> 
          getEvtFaceToDirInfoFieldBuilder() {
        if (evtFaceToDirInfoBuilder_ == null) {
          evtFaceToDirInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo, io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder, io.grasscutter.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder>(
                  getEvtFaceToDirInfo(),
                  getParentForChildren(),
                  isClean());
          evtFaceToDirInfo_ = null;
        }
        return evtFaceToDirInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtFaceToDirNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtFaceToDirNotify)
    private static final io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify();
    }

    public static io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtFaceToDirNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtFaceToDirNotify>() {
      @java.lang.Override
      public EvtFaceToDirNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtFaceToDirNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtFaceToDirNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtFaceToDirNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtFaceToDirNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtFaceToDirNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030EvtFaceToDirNotify.proto\032\026EvtFaceToDir" +
      "Info.proto\032\021ForwardType.proto\"i\n\022EvtFace" +
      "ToDirNotify\022\"\n\014forward_type\030\r \001(\0162\014.Forw" +
      "ardType\022/\n\024evt_face_to_dir_info\030\005 \001(\0132\021." +
      "EvtFaceToDirInfoB\026\n\024io.grasscutter.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.EvtFaceToDirInfoOuterClass.getDescriptor(),
          io.grasscutter.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtFaceToDirNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtFaceToDirNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtFaceToDirNotify_descriptor,
        new java.lang.String[] { "ForwardType", "EvtFaceToDirInfo", });
    io.grasscutter.proto.EvtFaceToDirInfoOuterClass.getDescriptor();
    io.grasscutter.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}