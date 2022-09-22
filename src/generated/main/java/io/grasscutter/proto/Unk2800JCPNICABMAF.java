// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_JCPNICABMAF.proto

package io.grasscutter.proto;

public final class Unk2800JCPNICABMAF {
  private Unk2800JCPNICABMAF() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_JCPNICABMAFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_JCPNICABMAF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 coin = 10;</code>
     * @return The coin.
     */
    int getCoin();

    /**
     * <code>.Unk2800_IMLDGLIMODE stage = 8;</code>
     * @return The enum numeric value on the wire for stage.
     */
    int getStageValue();
    /**
     * <code>.Unk2800_IMLDGLIMODE stage = 8;</code>
     * @return The stage.
     */
    io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE getStage();

    /**
     * <code>uint32 kill_monster_count = 4;</code>
     * @return The killMonsterCount.
     */
    int getKillMonsterCount();

    /**
     * <code>uint32 progress = 15;</code>
     * @return The progress.
     */
    int getProgress();
  }
  /**
   * <pre>
   * CmdId: 5504
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2800_JCPNICABMAF}
   */
  public static final class Unk2800_JCPNICABMAF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_JCPNICABMAF)
      Unk2800_JCPNICABMAFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_JCPNICABMAF.newBuilder() to construct.
    private Unk2800_JCPNICABMAF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_JCPNICABMAF() {
      stage_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_JCPNICABMAF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2800_JCPNICABMAF(
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
            case 32: {

              killMonsterCount_ = input.readUInt32();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();

              stage_ = rawValue;
              break;
            }
            case 80: {

              coin_ = input.readUInt32();
              break;
            }
            case 120: {

              progress_ = input.readUInt32();
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
      return io.grasscutter.proto.Unk2800JCPNICABMAF.internal_static_Unk2800_JCPNICABMAF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2800JCPNICABMAF.internal_static_Unk2800_JCPNICABMAF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF.class, io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF.Builder.class);
    }

    public static final int COIN_FIELD_NUMBER = 10;
    private int coin_;
    /**
     * <code>uint32 coin = 10;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }

    public static final int STAGE_FIELD_NUMBER = 8;
    private int stage_;
    /**
     * <code>.Unk2800_IMLDGLIMODE stage = 8;</code>
     * @return The enum numeric value on the wire for stage.
     */
    @java.lang.Override public int getStageValue() {
      return stage_;
    }
    /**
     * <code>.Unk2800_IMLDGLIMODE stage = 8;</code>
     * @return The stage.
     */
    @java.lang.Override public io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE getStage() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE result = io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE.valueOf(stage_);
      return result == null ? io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE.UNRECOGNIZED : result;
    }

    public static final int KILL_MONSTER_COUNT_FIELD_NUMBER = 4;
    private int killMonsterCount_;
    /**
     * <code>uint32 kill_monster_count = 4;</code>
     * @return The killMonsterCount.
     */
    @java.lang.Override
    public int getKillMonsterCount() {
      return killMonsterCount_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 15;
    private int progress_;
    /**
     * <code>uint32 progress = 15;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
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
      if (killMonsterCount_ != 0) {
        output.writeUInt32(4, killMonsterCount_);
      }
      if (stage_ != io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE.Unk2800_IMLDGLIMODE_NONE.getNumber()) {
        output.writeEnum(8, stage_);
      }
      if (coin_ != 0) {
        output.writeUInt32(10, coin_);
      }
      if (progress_ != 0) {
        output.writeUInt32(15, progress_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, killMonsterCount_);
      }
      if (stage_ != io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE.Unk2800_IMLDGLIMODE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, stage_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, coin_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, progress_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF other = (io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF) obj;

      if (getCoin()
          != other.getCoin()) return false;
      if (stage_ != other.stage_) return false;
      if (getKillMonsterCount()
          != other.getKillMonsterCount()) return false;
      if (getProgress()
          != other.getProgress()) return false;
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
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (37 * hash) + STAGE_FIELD_NUMBER;
      hash = (53 * hash) + stage_;
      hash = (37 * hash) + KILL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterCount();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF prototype) {
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
     * CmdId: 5504
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2800_JCPNICABMAF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_JCPNICABMAF)
        io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2800JCPNICABMAF.internal_static_Unk2800_JCPNICABMAF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2800JCPNICABMAF.internal_static_Unk2800_JCPNICABMAF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF.class, io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF.newBuilder()
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
        coin_ = 0;

        stage_ = 0;

        killMonsterCount_ = 0;

        progress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2800JCPNICABMAF.internal_static_Unk2800_JCPNICABMAF_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF build() {
        io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF buildPartial() {
        io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF result = new io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF(this);
        result.coin_ = coin_;
        result.stage_ = stage_;
        result.killMonsterCount_ = killMonsterCount_;
        result.progress_ = progress_;
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
        if (other instanceof io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF) {
          return mergeFrom((io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF other) {
        if (other == io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF.getDefaultInstance()) return this;
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
        }
        if (other.stage_ != 0) {
          setStageValue(other.getStageValue());
        }
        if (other.getKillMonsterCount() != 0) {
          setKillMonsterCount(other.getKillMonsterCount());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
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
        io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int coin_ ;
      /**
       * <code>uint32 coin = 10;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 10;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        
        coin_ = 0;
        onChanged();
        return this;
      }

      private int stage_ = 0;
      /**
       * <code>.Unk2800_IMLDGLIMODE stage = 8;</code>
       * @return The enum numeric value on the wire for stage.
       */
      @java.lang.Override public int getStageValue() {
        return stage_;
      }
      /**
       * <code>.Unk2800_IMLDGLIMODE stage = 8;</code>
       * @param value The enum numeric value on the wire for stage to set.
       * @return This builder for chaining.
       */
      public Builder setStageValue(int value) {
        
        stage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2800_IMLDGLIMODE stage = 8;</code>
       * @return The stage.
       */
      @java.lang.Override
      public io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE getStage() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE result = io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE.valueOf(stage_);
        return result == null ? io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2800_IMLDGLIMODE stage = 8;</code>
       * @param value The stage to set.
       * @return This builder for chaining.
       */
      public Builder setStage(io.grasscutter.proto.Unk2800IMLDGLIMODE.Unk2800_IMLDGLIMODE value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        stage_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2800_IMLDGLIMODE stage = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearStage() {
        
        stage_ = 0;
        onChanged();
        return this;
      }

      private int killMonsterCount_ ;
      /**
       * <code>uint32 kill_monster_count = 4;</code>
       * @return The killMonsterCount.
       */
      @java.lang.Override
      public int getKillMonsterCount() {
        return killMonsterCount_;
      }
      /**
       * <code>uint32 kill_monster_count = 4;</code>
       * @param value The killMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillMonsterCount(int value) {
        
        killMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_monster_count = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillMonsterCount() {
        
        killMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 15;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 15;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2800_JCPNICABMAF)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_JCPNICABMAF)
    private static final io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF();
    }

    public static io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_JCPNICABMAF>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_JCPNICABMAF>() {
      @java.lang.Override
      public Unk2800_JCPNICABMAF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2800_JCPNICABMAF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2800_JCPNICABMAF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_JCPNICABMAF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2800JCPNICABMAF.Unk2800_JCPNICABMAF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_JCPNICABMAF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_JCPNICABMAF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_JCPNICABMAF.proto\032\031Unk2800_IML" +
      "DGLIMODE.proto\"v\n\023Unk2800_JCPNICABMAF\022\014\n" +
      "\004coin\030\n \001(\r\022#\n\005stage\030\010 \001(\0162\024.Unk2800_IML" +
      "DGLIMODE\022\032\n\022kill_monster_count\030\004 \001(\r\022\020\n\010" +
      "progress\030\017 \001(\rB\026\n\024io.grasscutter.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk2800IMLDGLIMODE.getDescriptor(),
        });
    internal_static_Unk2800_JCPNICABMAF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_JCPNICABMAF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_JCPNICABMAF_descriptor,
        new java.lang.String[] { "Coin", "Stage", "KillMonsterCount", "Progress", });
    io.grasscutter.proto.Unk2800IMLDGLIMODE.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}