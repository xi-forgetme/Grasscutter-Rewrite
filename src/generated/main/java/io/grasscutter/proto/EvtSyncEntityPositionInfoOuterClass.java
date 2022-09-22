// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtSyncEntityPositionInfo.proto

package io.grasscutter.proto;

public final class EvtSyncEntityPositionInfoOuterClass {
  private EvtSyncEntityPositionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtSyncEntityPositionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtSyncEntityPositionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 normalized_time_compact = 13;</code>
     * @return The normalizedTimeCompact.
     */
    int getNormalizedTimeCompact();

    /**
     * <code>uint32 state_hash = 8;</code>
     * @return The stateHash.
     */
    int getStateHash();

    /**
     * <code>int32 face_angle_compact = 7;</code>
     * @return The faceAngleCompact.
     */
    int getFaceAngleCompact();

    /**
     * <code>.Vector pos = 15;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 15;</code>
     * @return The pos.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 15;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();
  }
  /**
   * Protobuf type {@code EvtSyncEntityPositionInfo}
   */
  public static final class EvtSyncEntityPositionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtSyncEntityPositionInfo)
      EvtSyncEntityPositionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtSyncEntityPositionInfo.newBuilder() to construct.
    private EvtSyncEntityPositionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtSyncEntityPositionInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtSyncEntityPositionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtSyncEntityPositionInfo(
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

              faceAngleCompact_ = input.readInt32();
              break;
            }
            case 64: {

              stateHash_ = input.readUInt32();
              break;
            }
            case 80: {

              entityId_ = input.readUInt32();
              break;
            }
            case 104: {

              normalizedTimeCompact_ = input.readUInt32();
              break;
            }
            case 122: {
              io.grasscutter.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (pos_ != null) {
                subBuilder = pos_.toBuilder();
              }
              pos_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pos_);
                pos_ = subBuilder.buildPartial();
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
      return io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.internal_static_EvtSyncEntityPositionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.internal_static_EvtSyncEntityPositionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo.class, io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo.Builder.class);
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

    public static final int NORMALIZED_TIME_COMPACT_FIELD_NUMBER = 13;
    private int normalizedTimeCompact_;
    /**
     * <code>uint32 normalized_time_compact = 13;</code>
     * @return The normalizedTimeCompact.
     */
    @java.lang.Override
    public int getNormalizedTimeCompact() {
      return normalizedTimeCompact_;
    }

    public static final int STATE_HASH_FIELD_NUMBER = 8;
    private int stateHash_;
    /**
     * <code>uint32 state_hash = 8;</code>
     * @return The stateHash.
     */
    @java.lang.Override
    public int getStateHash() {
      return stateHash_;
    }

    public static final int FACE_ANGLE_COMPACT_FIELD_NUMBER = 7;
    private int faceAngleCompact_;
    /**
     * <code>int32 face_angle_compact = 7;</code>
     * @return The faceAngleCompact.
     */
    @java.lang.Override
    public int getFaceAngleCompact() {
      return faceAngleCompact_;
    }

    public static final int POS_FIELD_NUMBER = 15;
    private io.grasscutter.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 15;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 15;</code>
     * @return The pos.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 15;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
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
      if (faceAngleCompact_ != 0) {
        output.writeInt32(7, faceAngleCompact_);
      }
      if (stateHash_ != 0) {
        output.writeUInt32(8, stateHash_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      if (normalizedTimeCompact_ != 0) {
        output.writeUInt32(13, normalizedTimeCompact_);
      }
      if (pos_ != null) {
        output.writeMessage(15, getPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (faceAngleCompact_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, faceAngleCompact_);
      }
      if (stateHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, stateHash_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
      }
      if (normalizedTimeCompact_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, normalizedTimeCompact_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getPos());
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
      if (!(obj instanceof io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo other = (io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getNormalizedTimeCompact()
          != other.getNormalizedTimeCompact()) return false;
      if (getStateHash()
          != other.getStateHash()) return false;
      if (getFaceAngleCompact()
          != other.getFaceAngleCompact()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + NORMALIZED_TIME_COMPACT_FIELD_NUMBER;
      hash = (53 * hash) + getNormalizedTimeCompact();
      hash = (37 * hash) + STATE_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getStateHash();
      hash = (37 * hash) + FACE_ANGLE_COMPACT_FIELD_NUMBER;
      hash = (53 * hash) + getFaceAngleCompact();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo prototype) {
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
     * Protobuf type {@code EvtSyncEntityPositionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtSyncEntityPositionInfo)
        io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.internal_static_EvtSyncEntityPositionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.internal_static_EvtSyncEntityPositionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo.class, io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo.newBuilder()
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
        entityId_ = 0;

        normalizedTimeCompact_ = 0;

        stateHash_ = 0;

        faceAngleCompact_ = 0;

        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.internal_static_EvtSyncEntityPositionInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo build() {
        io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo buildPartial() {
        io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo result = new io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo(this);
        result.entityId_ = entityId_;
        result.normalizedTimeCompact_ = normalizedTimeCompact_;
        result.stateHash_ = stateHash_;
        result.faceAngleCompact_ = faceAngleCompact_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo) {
          return mergeFrom((io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo other) {
        if (other == io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getNormalizedTimeCompact() != 0) {
          setNormalizedTimeCompact(other.getNormalizedTimeCompact());
        }
        if (other.getStateHash() != 0) {
          setStateHash(other.getStateHash());
        }
        if (other.getFaceAngleCompact() != 0) {
          setFaceAngleCompact(other.getFaceAngleCompact());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
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
        io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
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

      private int normalizedTimeCompact_ ;
      /**
       * <code>uint32 normalized_time_compact = 13;</code>
       * @return The normalizedTimeCompact.
       */
      @java.lang.Override
      public int getNormalizedTimeCompact() {
        return normalizedTimeCompact_;
      }
      /**
       * <code>uint32 normalized_time_compact = 13;</code>
       * @param value The normalizedTimeCompact to set.
       * @return This builder for chaining.
       */
      public Builder setNormalizedTimeCompact(int value) {
        
        normalizedTimeCompact_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 normalized_time_compact = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearNormalizedTimeCompact() {
        
        normalizedTimeCompact_ = 0;
        onChanged();
        return this;
      }

      private int stateHash_ ;
      /**
       * <code>uint32 state_hash = 8;</code>
       * @return The stateHash.
       */
      @java.lang.Override
      public int getStateHash() {
        return stateHash_;
      }
      /**
       * <code>uint32 state_hash = 8;</code>
       * @param value The stateHash to set.
       * @return This builder for chaining.
       */
      public Builder setStateHash(int value) {
        
        stateHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 state_hash = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearStateHash() {
        
        stateHash_ = 0;
        onChanged();
        return this;
      }

      private int faceAngleCompact_ ;
      /**
       * <code>int32 face_angle_compact = 7;</code>
       * @return The faceAngleCompact.
       */
      @java.lang.Override
      public int getFaceAngleCompact() {
        return faceAngleCompact_;
      }
      /**
       * <code>int32 face_angle_compact = 7;</code>
       * @param value The faceAngleCompact to set.
       * @return This builder for chaining.
       */
      public Builder setFaceAngleCompact(int value) {
        
        faceAngleCompact_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 face_angle_compact = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaceAngleCompact() {
        
        faceAngleCompact_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 15;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 15;</code>
       * @return The pos.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public Builder setPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public Builder setPos(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public Builder mergePos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtSyncEntityPositionInfo)
    }

    // @@protoc_insertion_point(class_scope:EvtSyncEntityPositionInfo)
    private static final io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo();
    }

    public static io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtSyncEntityPositionInfo>
        PARSER = new com.google.protobuf.AbstractParser<EvtSyncEntityPositionInfo>() {
      @java.lang.Override
      public EvtSyncEntityPositionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtSyncEntityPositionInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtSyncEntityPositionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtSyncEntityPositionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtSyncEntityPositionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtSyncEntityPositionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037EvtSyncEntityPositionInfo.proto\032\014Vecto" +
      "r.proto\"\225\001\n\031EvtSyncEntityPositionInfo\022\021\n" +
      "\tentity_id\030\n \001(\r\022\037\n\027normalized_time_comp" +
      "act\030\r \001(\r\022\022\n\nstate_hash\030\010 \001(\r\022\032\n\022face_an" +
      "gle_compact\030\007 \001(\005\022\024\n\003pos\030\017 \001(\0132\007.VectorB" +
      "\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtSyncEntityPositionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtSyncEntityPositionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtSyncEntityPositionInfo_descriptor,
        new java.lang.String[] { "EntityId", "NormalizedTimeCompact", "StateHash", "FaceAngleCompact", "Pos", });
    io.grasscutter.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}