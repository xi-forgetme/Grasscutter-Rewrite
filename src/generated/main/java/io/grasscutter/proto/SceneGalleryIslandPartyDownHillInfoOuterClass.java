// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryIslandPartyDownHillInfo.proto

package io.grasscutter.proto;

public final class SceneGalleryIslandPartyDownHillInfoOuterClass {
  private SceneGalleryIslandPartyDownHillInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryIslandPartyDownHillInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryIslandPartyDownHillInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2800_LBPCDCHOOLJ = 14;</code>
     * @return The unk2800LBPCDCHOOLJ.
     */
    int getUnk2800LBPCDCHOOLJ();

    /**
     * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 15;</code>
     * @return The enum numeric value on the wire for unk2800ENJGEFBCLOL.
     */
    int getUnk2800ENJGEFBCLOLValue();
    /**
     * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 15;</code>
     * @return The unk2800ENJGEFBCLOL.
     */
    io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB getUnk2800ENJGEFBCLOL();

    /**
     * <code>uint32 Unk2800_BKEFLDCEBLF = 5;</code>
     * @return The unk2800BKEFLDCEBLF.
     */
    int getUnk2800BKEFLDCEBLF();

    /**
     * <code>uint32 coin = 13;</code>
     * @return The coin.
     */
    int getCoin();
  }
  /**
   * Protobuf type {@code SceneGalleryIslandPartyDownHillInfo}
   */
  public static final class SceneGalleryIslandPartyDownHillInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryIslandPartyDownHillInfo)
      SceneGalleryIslandPartyDownHillInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryIslandPartyDownHillInfo.newBuilder() to construct.
    private SceneGalleryIslandPartyDownHillInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryIslandPartyDownHillInfo() {
      unk2800ENJGEFBCLOL_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryIslandPartyDownHillInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryIslandPartyDownHillInfo(
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
            case 40: {

              unk2800BKEFLDCEBLF_ = input.readUInt32();
              break;
            }
            case 104: {

              coin_ = input.readUInt32();
              break;
            }
            case 112: {

              unk2800LBPCDCHOOLJ_ = input.readUInt32();
              break;
            }
            case 120: {
              int rawValue = input.readEnum();

              unk2800ENJGEFBCLOL_ = rawValue;
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
      return io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.internal_static_SceneGalleryIslandPartyDownHillInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.internal_static_SceneGalleryIslandPartyDownHillInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo.class, io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo.Builder.class);
    }

    public static final int UNK2800_LBPCDCHOOLJ_FIELD_NUMBER = 14;
    private int unk2800LBPCDCHOOLJ_;
    /**
     * <code>uint32 Unk2800_LBPCDCHOOLJ = 14;</code>
     * @return The unk2800LBPCDCHOOLJ.
     */
    @java.lang.Override
    public int getUnk2800LBPCDCHOOLJ() {
      return unk2800LBPCDCHOOLJ_;
    }

    public static final int UNK2800_ENJGEFBCLOL_FIELD_NUMBER = 15;
    private int unk2800ENJGEFBCLOL_;
    /**
     * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 15;</code>
     * @return The enum numeric value on the wire for unk2800ENJGEFBCLOL.
     */
    @java.lang.Override public int getUnk2800ENJGEFBCLOLValue() {
      return unk2800ENJGEFBCLOL_;
    }
    /**
     * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 15;</code>
     * @return The unk2800ENJGEFBCLOL.
     */
    @java.lang.Override public io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB getUnk2800ENJGEFBCLOL() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB result = io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.valueOf(unk2800ENJGEFBCLOL_);
      return result == null ? io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.UNRECOGNIZED : result;
    }

    public static final int UNK2800_BKEFLDCEBLF_FIELD_NUMBER = 5;
    private int unk2800BKEFLDCEBLF_;
    /**
     * <code>uint32 Unk2800_BKEFLDCEBLF = 5;</code>
     * @return The unk2800BKEFLDCEBLF.
     */
    @java.lang.Override
    public int getUnk2800BKEFLDCEBLF() {
      return unk2800BKEFLDCEBLF_;
    }

    public static final int COIN_FIELD_NUMBER = 13;
    private int coin_;
    /**
     * <code>uint32 coin = 13;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
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
      if (unk2800BKEFLDCEBLF_ != 0) {
        output.writeUInt32(5, unk2800BKEFLDCEBLF_);
      }
      if (coin_ != 0) {
        output.writeUInt32(13, coin_);
      }
      if (unk2800LBPCDCHOOLJ_ != 0) {
        output.writeUInt32(14, unk2800LBPCDCHOOLJ_);
      }
      if (unk2800ENJGEFBCLOL_ != io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.Unk2800_FMAOEPEBKHB_Unk2800_IBMPPHFLKEO.getNumber()) {
        output.writeEnum(15, unk2800ENJGEFBCLOL_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2800BKEFLDCEBLF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk2800BKEFLDCEBLF_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, coin_);
      }
      if (unk2800LBPCDCHOOLJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk2800LBPCDCHOOLJ_);
      }
      if (unk2800ENJGEFBCLOL_ != io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.Unk2800_FMAOEPEBKHB_Unk2800_IBMPPHFLKEO.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, unk2800ENJGEFBCLOL_);
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
      if (!(obj instanceof io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo other = (io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo) obj;

      if (getUnk2800LBPCDCHOOLJ()
          != other.getUnk2800LBPCDCHOOLJ()) return false;
      if (unk2800ENJGEFBCLOL_ != other.unk2800ENJGEFBCLOL_) return false;
      if (getUnk2800BKEFLDCEBLF()
          != other.getUnk2800BKEFLDCEBLF()) return false;
      if (getCoin()
          != other.getCoin()) return false;
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
      hash = (37 * hash) + UNK2800_LBPCDCHOOLJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800LBPCDCHOOLJ();
      hash = (37 * hash) + UNK2800_ENJGEFBCLOL_FIELD_NUMBER;
      hash = (53 * hash) + unk2800ENJGEFBCLOL_;
      hash = (37 * hash) + UNK2800_BKEFLDCEBLF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800BKEFLDCEBLF();
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo prototype) {
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
     * Protobuf type {@code SceneGalleryIslandPartyDownHillInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryIslandPartyDownHillInfo)
        io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.internal_static_SceneGalleryIslandPartyDownHillInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.internal_static_SceneGalleryIslandPartyDownHillInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo.class, io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo.newBuilder()
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
        unk2800LBPCDCHOOLJ_ = 0;

        unk2800ENJGEFBCLOL_ = 0;

        unk2800BKEFLDCEBLF_ = 0;

        coin_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.internal_static_SceneGalleryIslandPartyDownHillInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo build() {
        io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo buildPartial() {
        io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo result = new io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo(this);
        result.unk2800LBPCDCHOOLJ_ = unk2800LBPCDCHOOLJ_;
        result.unk2800ENJGEFBCLOL_ = unk2800ENJGEFBCLOL_;
        result.unk2800BKEFLDCEBLF_ = unk2800BKEFLDCEBLF_;
        result.coin_ = coin_;
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
        if (other instanceof io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo) {
          return mergeFrom((io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo other) {
        if (other == io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo.getDefaultInstance()) return this;
        if (other.getUnk2800LBPCDCHOOLJ() != 0) {
          setUnk2800LBPCDCHOOLJ(other.getUnk2800LBPCDCHOOLJ());
        }
        if (other.unk2800ENJGEFBCLOL_ != 0) {
          setUnk2800ENJGEFBCLOLValue(other.getUnk2800ENJGEFBCLOLValue());
        }
        if (other.getUnk2800BKEFLDCEBLF() != 0) {
          setUnk2800BKEFLDCEBLF(other.getUnk2800BKEFLDCEBLF());
        }
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
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
        io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk2800LBPCDCHOOLJ_ ;
      /**
       * <code>uint32 Unk2800_LBPCDCHOOLJ = 14;</code>
       * @return The unk2800LBPCDCHOOLJ.
       */
      @java.lang.Override
      public int getUnk2800LBPCDCHOOLJ() {
        return unk2800LBPCDCHOOLJ_;
      }
      /**
       * <code>uint32 Unk2800_LBPCDCHOOLJ = 14;</code>
       * @param value The unk2800LBPCDCHOOLJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800LBPCDCHOOLJ(int value) {
        
        unk2800LBPCDCHOOLJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_LBPCDCHOOLJ = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800LBPCDCHOOLJ() {
        
        unk2800LBPCDCHOOLJ_ = 0;
        onChanged();
        return this;
      }

      private int unk2800ENJGEFBCLOL_ = 0;
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 15;</code>
       * @return The enum numeric value on the wire for unk2800ENJGEFBCLOL.
       */
      @java.lang.Override public int getUnk2800ENJGEFBCLOLValue() {
        return unk2800ENJGEFBCLOL_;
      }
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 15;</code>
       * @param value The enum numeric value on the wire for unk2800ENJGEFBCLOL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800ENJGEFBCLOLValue(int value) {
        
        unk2800ENJGEFBCLOL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 15;</code>
       * @return The unk2800ENJGEFBCLOL.
       */
      @java.lang.Override
      public io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB getUnk2800ENJGEFBCLOL() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB result = io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.valueOf(unk2800ENJGEFBCLOL_);
        return result == null ? io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 15;</code>
       * @param value The unk2800ENJGEFBCLOL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800ENJGEFBCLOL(io.grasscutter.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unk2800ENJGEFBCLOL_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800ENJGEFBCLOL() {
        
        unk2800ENJGEFBCLOL_ = 0;
        onChanged();
        return this;
      }

      private int unk2800BKEFLDCEBLF_ ;
      /**
       * <code>uint32 Unk2800_BKEFLDCEBLF = 5;</code>
       * @return The unk2800BKEFLDCEBLF.
       */
      @java.lang.Override
      public int getUnk2800BKEFLDCEBLF() {
        return unk2800BKEFLDCEBLF_;
      }
      /**
       * <code>uint32 Unk2800_BKEFLDCEBLF = 5;</code>
       * @param value The unk2800BKEFLDCEBLF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800BKEFLDCEBLF(int value) {
        
        unk2800BKEFLDCEBLF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_BKEFLDCEBLF = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800BKEFLDCEBLF() {
        
        unk2800BKEFLDCEBLF_ = 0;
        onChanged();
        return this;
      }

      private int coin_ ;
      /**
       * <code>uint32 coin = 13;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 13;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        
        coin_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryIslandPartyDownHillInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryIslandPartyDownHillInfo)
    private static final io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo();
    }

    public static io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryIslandPartyDownHillInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryIslandPartyDownHillInfo>() {
      @java.lang.Override
      public SceneGalleryIslandPartyDownHillInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryIslandPartyDownHillInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryIslandPartyDownHillInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryIslandPartyDownHillInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SceneGalleryIslandPartyDownHillInfoOuterClass.SceneGalleryIslandPartyDownHillInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryIslandPartyDownHillInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryIslandPartyDownHillInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)SceneGalleryIslandPartyDownHillInfo.pr" +
      "oto\032\031Unk2800_FMAOEPEBKHB.proto\"\240\001\n#Scene" +
      "GalleryIslandPartyDownHillInfo\022\033\n\023Unk280" +
      "0_LBPCDCHOOLJ\030\016 \001(\r\0221\n\023Unk2800_ENJGEFBCL" +
      "OL\030\017 \001(\0162\024.Unk2800_FMAOEPEBKHB\022\033\n\023Unk280" +
      "0_BKEFLDCEBLF\030\005 \001(\r\022\014\n\004coin\030\r \001(\rB\026\n\024io." +
      "grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk2800FMAOEPEBKHB.getDescriptor(),
        });
    internal_static_SceneGalleryIslandPartyDownHillInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryIslandPartyDownHillInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryIslandPartyDownHillInfo_descriptor,
        new java.lang.String[] { "Unk2800LBPCDCHOOLJ", "Unk2800ENJGEFBCLOL", "Unk2800BKEFLDCEBLF", "Coin", });
    io.grasscutter.proto.Unk2800FMAOEPEBKHB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}