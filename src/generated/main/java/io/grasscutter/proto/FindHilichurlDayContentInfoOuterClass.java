// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FindHilichurlDayContentInfo.proto

package io.grasscutter.proto;

public final class FindHilichurlDayContentInfoOuterClass {
  private FindHilichurlDayContentInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FindHilichurlDayContentInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FindHilichurlDayContentInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 start_time = 1;</code>
     * @return The startTime.
     */
    int getStartTime();
  }
  /**
   * Protobuf type {@code FindHilichurlDayContentInfo}
   */
  public static final class FindHilichurlDayContentInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FindHilichurlDayContentInfo)
      FindHilichurlDayContentInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FindHilichurlDayContentInfo.newBuilder() to construct.
    private FindHilichurlDayContentInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FindHilichurlDayContentInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FindHilichurlDayContentInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FindHilichurlDayContentInfo(
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
            case 8: {

              startTime_ = input.readUInt32();
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
      return io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.internal_static_FindHilichurlDayContentInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.internal_static_FindHilichurlDayContentInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo.class, io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo.Builder.class);
    }

    public static final int START_TIME_FIELD_NUMBER = 1;
    private int startTime_;
    /**
     * <code>uint32 start_time = 1;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
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
      if (startTime_ != 0) {
        output.writeUInt32(1, startTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (startTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, startTime_);
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
      if (!(obj instanceof io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo other = (io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo) obj;

      if (getStartTime()
          != other.getStartTime()) return false;
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
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo prototype) {
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
     * Protobuf type {@code FindHilichurlDayContentInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FindHilichurlDayContentInfo)
        io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.internal_static_FindHilichurlDayContentInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.internal_static_FindHilichurlDayContentInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo.class, io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo.newBuilder()
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
        startTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.internal_static_FindHilichurlDayContentInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo build() {
        io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo buildPartial() {
        io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo result = new io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo(this);
        result.startTime_ = startTime_;
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
        if (other instanceof io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo) {
          return mergeFrom((io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo other) {
        if (other == io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo.getDefaultInstance()) return this;
        if (other.getStartTime() != 0) {
          setStartTime(other.getStartTime());
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
        io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int startTime_ ;
      /**
       * <code>uint32 start_time = 1;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public int getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint32 start_time = 1;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(int value) {
        
        startTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        
        startTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FindHilichurlDayContentInfo)
    }

    // @@protoc_insertion_point(class_scope:FindHilichurlDayContentInfo)
    private static final io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo();
    }

    public static io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FindHilichurlDayContentInfo>
        PARSER = new com.google.protobuf.AbstractParser<FindHilichurlDayContentInfo>() {
      @java.lang.Override
      public FindHilichurlDayContentInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FindHilichurlDayContentInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FindHilichurlDayContentInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FindHilichurlDayContentInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.FindHilichurlDayContentInfoOuterClass.FindHilichurlDayContentInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FindHilichurlDayContentInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FindHilichurlDayContentInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!FindHilichurlDayContentInfo.proto\"1\n\033F" +
      "indHilichurlDayContentInfo\022\022\n\nstart_time" +
      "\030\001 \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FindHilichurlDayContentInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FindHilichurlDayContentInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FindHilichurlDayContentInfo_descriptor,
        new java.lang.String[] { "StartTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}