// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneRouteChangeInfo.proto

package io.grasscutter.proto;

public final class SceneRouteChangeInfoOuterClass {
  private SceneRouteChangeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneRouteChangeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneRouteChangeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_forward = 12;</code>
     * @return The isForward.
     */
    boolean getIsForward();

    /**
     * <code>uint32 route_id = 15;</code>
     * @return The routeId.
     */
    int getRouteId();

    /**
     * <code>uint32 type = 4;</code>
     * @return The type.
     */
    int getType();

    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    java.util.List<io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> 
        getPointListList();
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getPointList(int index);
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    int getPointListCount();
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    java.util.List<? extends io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> 
        getPointListOrBuilderList();
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder getPointListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code SceneRouteChangeInfo}
   */
  public static final class SceneRouteChangeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneRouteChangeInfo)
      SceneRouteChangeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneRouteChangeInfo.newBuilder() to construct.
    private SceneRouteChangeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneRouteChangeInfo() {
      pointList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneRouteChangeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneRouteChangeInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pointList_ = new java.util.ArrayList<io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              pointList_.add(
                  input.readMessage(io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.parser(), extensionRegistry));
              break;
            }
            case 32: {

              type_ = input.readUInt32();
              break;
            }
            case 96: {

              isForward_ = input.readBool();
              break;
            }
            case 120: {

              routeId_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          pointList_ = java.util.Collections.unmodifiableList(pointList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.class, io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.Builder.class);
    }

    public static final int IS_FORWARD_FIELD_NUMBER = 12;
    private boolean isForward_;
    /**
     * <code>bool is_forward = 12;</code>
     * @return The isForward.
     */
    @java.lang.Override
    public boolean getIsForward() {
      return isForward_;
    }

    public static final int ROUTE_ID_FIELD_NUMBER = 15;
    private int routeId_;
    /**
     * <code>uint32 route_id = 15;</code>
     * @return The routeId.
     */
    @java.lang.Override
    public int getRouteId() {
      return routeId_;
    }

    public static final int TYPE_FIELD_NUMBER = 4;
    private int type_;
    /**
     * <code>uint32 type = 4;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    public static final int POINT_LIST_FIELD_NUMBER = 1;
    private java.util.List<io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> pointList_;
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> getPointListList() {
      return pointList_;
    }
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> 
        getPointListOrBuilderList() {
      return pointList_;
    }
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    @java.lang.Override
    public int getPointListCount() {
      return pointList_.size();
    }
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getPointList(int index) {
      return pointList_.get(index);
    }
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder getPointListOrBuilder(
        int index) {
      return pointList_.get(index);
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
      for (int i = 0; i < pointList_.size(); i++) {
        output.writeMessage(1, pointList_.get(i));
      }
      if (type_ != 0) {
        output.writeUInt32(4, type_);
      }
      if (isForward_ != false) {
        output.writeBool(12, isForward_);
      }
      if (routeId_ != 0) {
        output.writeUInt32(15, routeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < pointList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, pointList_.get(i));
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, type_);
      }
      if (isForward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isForward_);
      }
      if (routeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, routeId_);
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
      if (!(obj instanceof io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo other = (io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo) obj;

      if (getIsForward()
          != other.getIsForward()) return false;
      if (getRouteId()
          != other.getRouteId()) return false;
      if (getType()
          != other.getType()) return false;
      if (!getPointListList()
          .equals(other.getPointListList())) return false;
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
      hash = (37 * hash) + IS_FORWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForward());
      hash = (37 * hash) + ROUTE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRouteId();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      if (getPointListCount() > 0) {
        hash = (37 * hash) + POINT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPointListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo prototype) {
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
     * Protobuf type {@code SceneRouteChangeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneRouteChangeInfo)
        io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.class, io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.newBuilder()
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
          getPointListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isForward_ = false;

        routeId_ = 0;

        type_ = 0;

        if (pointListBuilder_ == null) {
          pointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          pointListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo build() {
        io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo buildPartial() {
        io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo result = new io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo(this);
        int from_bitField0_ = bitField0_;
        result.isForward_ = isForward_;
        result.routeId_ = routeId_;
        result.type_ = type_;
        if (pointListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            pointList_ = java.util.Collections.unmodifiableList(pointList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pointList_ = pointList_;
        } else {
          result.pointList_ = pointListBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo) {
          return mergeFrom((io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo other) {
        if (other == io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.getDefaultInstance()) return this;
        if (other.getIsForward() != false) {
          setIsForward(other.getIsForward());
        }
        if (other.getRouteId() != 0) {
          setRouteId(other.getRouteId());
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (pointListBuilder_ == null) {
          if (!other.pointList_.isEmpty()) {
            if (pointList_.isEmpty()) {
              pointList_ = other.pointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePointListIsMutable();
              pointList_.addAll(other.pointList_);
            }
            onChanged();
          }
        } else {
          if (!other.pointList_.isEmpty()) {
            if (pointListBuilder_.isEmpty()) {
              pointListBuilder_.dispose();
              pointListBuilder_ = null;
              pointList_ = other.pointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              pointListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPointListFieldBuilder() : null;
            } else {
              pointListBuilder_.addAllMessages(other.pointList_);
            }
          }
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
        io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isForward_ ;
      /**
       * <code>bool is_forward = 12;</code>
       * @return The isForward.
       */
      @java.lang.Override
      public boolean getIsForward() {
        return isForward_;
      }
      /**
       * <code>bool is_forward = 12;</code>
       * @param value The isForward to set.
       * @return This builder for chaining.
       */
      public Builder setIsForward(boolean value) {
        
        isForward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_forward = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForward() {
        
        isForward_ = false;
        onChanged();
        return this;
      }

      private int routeId_ ;
      /**
       * <code>uint32 route_id = 15;</code>
       * @return The routeId.
       */
      @java.lang.Override
      public int getRouteId() {
        return routeId_;
      }
      /**
       * <code>uint32 route_id = 15;</code>
       * @param value The routeId to set.
       * @return This builder for chaining.
       */
      public Builder setRouteId(int value) {
        
        routeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 route_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRouteId() {
        
        routeId_ = 0;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>uint32 type = 4;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>uint32 type = 4;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> pointList_ =
        java.util.Collections.emptyList();
      private void ensurePointListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pointList_ = new java.util.ArrayList<io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo>(pointList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> pointListBuilder_;

      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public java.util.List<io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> getPointListList() {
        if (pointListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pointList_);
        } else {
          return pointListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public int getPointListCount() {
        if (pointListBuilder_ == null) {
          return pointList_.size();
        } else {
          return pointListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getPointList(int index) {
        if (pointListBuilder_ == null) {
          return pointList_.get(index);
        } else {
          return pointListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public Builder setPointList(
          int index, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo value) {
        if (pointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointListIsMutable();
          pointList_.set(index, value);
          onChanged();
        } else {
          pointListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public Builder setPointList(
          int index, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder builderForValue) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.set(index, builderForValue.build());
          onChanged();
        } else {
          pointListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public Builder addPointList(io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo value) {
        if (pointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointListIsMutable();
          pointList_.add(value);
          onChanged();
        } else {
          pointListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public Builder addPointList(
          int index, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo value) {
        if (pointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointListIsMutable();
          pointList_.add(index, value);
          onChanged();
        } else {
          pointListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public Builder addPointList(
          io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder builderForValue) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.add(builderForValue.build());
          onChanged();
        } else {
          pointListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public Builder addPointList(
          int index, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder builderForValue) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.add(index, builderForValue.build());
          onChanged();
        } else {
          pointListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public Builder addAllPointList(
          java.lang.Iterable<? extends io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> values) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pointList_);
          onChanged();
        } else {
          pointListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public Builder clearPointList() {
        if (pointListBuilder_ == null) {
          pointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          pointListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public Builder removePointList(int index) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.remove(index);
          onChanged();
        } else {
          pointListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder getPointListBuilder(
          int index) {
        return getPointListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder getPointListOrBuilder(
          int index) {
        if (pointListBuilder_ == null) {
          return pointList_.get(index);  } else {
          return pointListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> 
           getPointListOrBuilderList() {
        if (pointListBuilder_ != null) {
          return pointListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pointList_);
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder addPointListBuilder() {
        return getPointListFieldBuilder().addBuilder(
            io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder addPointListBuilder(
          int index) {
        return getPointListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 1;</code>
       */
      public java.util.List<io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder> 
           getPointListBuilderList() {
        return getPointListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> 
          getPointListFieldBuilder() {
        if (pointListBuilder_ == null) {
          pointListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder, io.grasscutter.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder>(
                  pointList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          pointList_ = null;
        }
        return pointListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneRouteChangeInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneRouteChangeInfo)
    private static final io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo();
    }

    public static io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneRouteChangeInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneRouteChangeInfo>() {
      @java.lang.Override
      public SceneRouteChangeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneRouteChangeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneRouteChangeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneRouteChangeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneRouteChangeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneRouteChangeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SceneRouteChangeInfo.proto\032\032RoutePoint" +
      "ChangeInfo.proto\"u\n\024SceneRouteChangeInfo" +
      "\022\022\n\nis_forward\030\014 \001(\010\022\020\n\010route_id\030\017 \001(\r\022\014" +
      "\n\004type\030\004 \001(\r\022)\n\npoint_list\030\001 \003(\0132\025.Route" +
      "PointChangeInfoB\026\n\024io.grasscutter.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.RoutePointChangeInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneRouteChangeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneRouteChangeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneRouteChangeInfo_descriptor,
        new java.lang.String[] { "IsForward", "RouteId", "Type", "PointList", });
    io.grasscutter.proto.RoutePointChangeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}