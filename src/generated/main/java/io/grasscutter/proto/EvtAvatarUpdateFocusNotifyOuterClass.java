// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAvatarUpdateFocusNotify.proto

package io.grasscutter.proto;

public final class EvtAvatarUpdateFocusNotifyOuterClass {
  private EvtAvatarUpdateFocusNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAvatarUpdateFocusNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAvatarUpdateFocusNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ForwardType forward_type = 7;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 7;</code>
     * @return The forwardType.
     */
    io.grasscutter.proto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>.Vector focus_forward = 11;</code>
     * @return Whether the focusForward field is set.
     */
    boolean hasFocusForward();
    /**
     * <code>.Vector focus_forward = 11;</code>
     * @return The focusForward.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getFocusForward();
    /**
     * <code>.Vector focus_forward = 11;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getFocusForwardOrBuilder();

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 327
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code EvtAvatarUpdateFocusNotify}
   */
  public static final class EvtAvatarUpdateFocusNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAvatarUpdateFocusNotify)
      EvtAvatarUpdateFocusNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAvatarUpdateFocusNotify.newBuilder() to construct.
    private EvtAvatarUpdateFocusNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAvatarUpdateFocusNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAvatarUpdateFocusNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtAvatarUpdateFocusNotify(
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
            case 56: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
              break;
            }
            case 80: {

              entityId_ = input.readUInt32();
              break;
            }
            case 90: {
              io.grasscutter.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (focusForward_ != null) {
                subBuilder = focusForward_.toBuilder();
              }
              focusForward_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(focusForward_);
                focusForward_ = subBuilder.buildPartial();
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
      return io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.class, io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.Builder.class);
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 7;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 7;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 7;</code>
     * @return The forwardType.
     */
    @java.lang.Override public io.grasscutter.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.ForwardTypeOuterClass.ForwardType result = io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int FOCUS_FORWARD_FIELD_NUMBER = 11;
    private io.grasscutter.proto.VectorOuterClass.Vector focusForward_;
    /**
     * <code>.Vector focus_forward = 11;</code>
     * @return Whether the focusForward field is set.
     */
    @java.lang.Override
    public boolean hasFocusForward() {
      return focusForward_ != null;
    }
    /**
     * <code>.Vector focus_forward = 11;</code>
     * @return The focusForward.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getFocusForward() {
      return focusForward_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : focusForward_;
    }
    /**
     * <code>.Vector focus_forward = 11;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getFocusForwardOrBuilder() {
      return getFocusForward();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 10;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
        output.writeEnum(7, forwardType_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      if (focusForward_ != null) {
        output.writeMessage(11, getFocusForward());
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
          .computeEnumSize(7, forwardType_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
      }
      if (focusForward_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getFocusForward());
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
      if (!(obj instanceof io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify other = (io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify) obj;

      if (forwardType_ != other.forwardType_) return false;
      if (hasFocusForward() != other.hasFocusForward()) return false;
      if (hasFocusForward()) {
        if (!getFocusForward()
            .equals(other.getFocusForward())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasFocusForward()) {
        hash = (37 * hash) + FOCUS_FORWARD_FIELD_NUMBER;
        hash = (53 * hash) + getFocusForward().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify prototype) {
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
     * CmdId: 327
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code EvtAvatarUpdateFocusNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAvatarUpdateFocusNotify)
        io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.class, io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.newBuilder()
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

        if (focusForwardBuilder_ == null) {
          focusForward_ = null;
        } else {
          focusForward_ = null;
          focusForwardBuilder_ = null;
        }
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify build() {
        io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify buildPartial() {
        io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify result = new io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify(this);
        result.forwardType_ = forwardType_;
        if (focusForwardBuilder_ == null) {
          result.focusForward_ = focusForward_;
        } else {
          result.focusForward_ = focusForwardBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify) {
          return mergeFrom((io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify other) {
        if (other == io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.getDefaultInstance()) return this;
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.hasFocusForward()) {
          mergeFocusForward(other.getFocusForward());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify) e.getUnfinishedMessage();
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
       * <code>.ForwardType forward_type = 7;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 7;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 7;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public io.grasscutter.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.ForwardTypeOuterClass.ForwardType result = io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? io.grasscutter.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 7;</code>
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
       * <code>.ForwardType forward_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector focusForward_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> focusForwardBuilder_;
      /**
       * <code>.Vector focus_forward = 11;</code>
       * @return Whether the focusForward field is set.
       */
      public boolean hasFocusForward() {
        return focusForwardBuilder_ != null || focusForward_ != null;
      }
      /**
       * <code>.Vector focus_forward = 11;</code>
       * @return The focusForward.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getFocusForward() {
        if (focusForwardBuilder_ == null) {
          return focusForward_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : focusForward_;
        } else {
          return focusForwardBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector focus_forward = 11;</code>
       */
      public Builder setFocusForward(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (focusForwardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          focusForward_ = value;
          onChanged();
        } else {
          focusForwardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector focus_forward = 11;</code>
       */
      public Builder setFocusForward(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (focusForwardBuilder_ == null) {
          focusForward_ = builderForValue.build();
          onChanged();
        } else {
          focusForwardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector focus_forward = 11;</code>
       */
      public Builder mergeFocusForward(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (focusForwardBuilder_ == null) {
          if (focusForward_ != null) {
            focusForward_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(focusForward_).mergeFrom(value).buildPartial();
          } else {
            focusForward_ = value;
          }
          onChanged();
        } else {
          focusForwardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector focus_forward = 11;</code>
       */
      public Builder clearFocusForward() {
        if (focusForwardBuilder_ == null) {
          focusForward_ = null;
          onChanged();
        } else {
          focusForward_ = null;
          focusForwardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector focus_forward = 11;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getFocusForwardBuilder() {
        
        onChanged();
        return getFocusForwardFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector focus_forward = 11;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getFocusForwardOrBuilder() {
        if (focusForwardBuilder_ != null) {
          return focusForwardBuilder_.getMessageOrBuilder();
        } else {
          return focusForward_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : focusForward_;
        }
      }
      /**
       * <code>.Vector focus_forward = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getFocusForwardFieldBuilder() {
        if (focusForwardBuilder_ == null) {
          focusForwardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getFocusForward(),
                  getParentForChildren(),
                  isClean());
          focusForward_ = null;
        }
        return focusForwardBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtAvatarUpdateFocusNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAvatarUpdateFocusNotify)
    private static final io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify();
    }

    public static io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAvatarUpdateFocusNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAvatarUpdateFocusNotify>() {
      @java.lang.Override
      public EvtAvatarUpdateFocusNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtAvatarUpdateFocusNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtAvatarUpdateFocusNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAvatarUpdateFocusNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAvatarUpdateFocusNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n EvtAvatarUpdateFocusNotify.proto\032\021Forw" +
      "ardType.proto\032\014Vector.proto\"s\n\032EvtAvatar" +
      "UpdateFocusNotify\022\"\n\014forward_type\030\007 \001(\0162" +
      "\014.ForwardType\022\036\n\rfocus_forward\030\013 \001(\0132\007.V" +
      "ector\022\021\n\tentity_id\030\n \001(\rB\026\n\024io.grasscutt" +
      "er.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.ForwardTypeOuterClass.getDescriptor(),
          io.grasscutter.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtAvatarUpdateFocusNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAvatarUpdateFocusNotify_descriptor,
        new java.lang.String[] { "ForwardType", "FocusForward", "EntityId", });
    io.grasscutter.proto.ForwardTypeOuterClass.getDescriptor();
    io.grasscutter.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}