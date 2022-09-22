// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_BNABFJBODGE.proto

package io.grasscutter.proto;

public final class Unk2700BNABFJBODGE {
  private Unk2700BNABFJBODGE() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_BNABFJBODGEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_BNABFJBODGE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 12;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 skill_id = 11;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>uint32 challenge_id = 10;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 Unk2700_AIKKJGOLLHK = 13;</code>
     * @return The unk2700AIKKJGOLLHK.
     */
    int getUnk2700AIKKJGOLLHK();
  }
  /**
   * <pre>
   * CmdId: 8226
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_BNABFJBODGE}
   */
  public static final class Unk2700_BNABFJBODGE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_BNABFJBODGE)
      Unk2700_BNABFJBODGEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_BNABFJBODGE.newBuilder() to construct.
    private Unk2700_BNABFJBODGE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_BNABFJBODGE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_BNABFJBODGE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_BNABFJBODGE(
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
            case 80: {

              challengeId_ = input.readUInt32();
              break;
            }
            case 88: {

              skillId_ = input.readUInt32();
              break;
            }
            case 96: {

              stageId_ = input.readUInt32();
              break;
            }
            case 104: {

              unk2700AIKKJGOLLHK_ = input.readUInt32();
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
      return io.grasscutter.proto.Unk2700BNABFJBODGE.internal_static_Unk2700_BNABFJBODGE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700BNABFJBODGE.internal_static_Unk2700_BNABFJBODGE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE.class, io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 12;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 12;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int SKILL_ID_FIELD_NUMBER = 11;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 11;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 10;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 10;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int UNK2700_AIKKJGOLLHK_FIELD_NUMBER = 13;
    private int unk2700AIKKJGOLLHK_;
    /**
     * <code>uint32 Unk2700_AIKKJGOLLHK = 13;</code>
     * @return The unk2700AIKKJGOLLHK.
     */
    @java.lang.Override
    public int getUnk2700AIKKJGOLLHK() {
      return unk2700AIKKJGOLLHK_;
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
      if (challengeId_ != 0) {
        output.writeUInt32(10, challengeId_);
      }
      if (skillId_ != 0) {
        output.writeUInt32(11, skillId_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(12, stageId_);
      }
      if (unk2700AIKKJGOLLHK_ != 0) {
        output.writeUInt32(13, unk2700AIKKJGOLLHK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, challengeId_);
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, skillId_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, stageId_);
      }
      if (unk2700AIKKJGOLLHK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk2700AIKKJGOLLHK_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE other = (io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getUnk2700AIKKJGOLLHK()
          != other.getUnk2700AIKKJGOLLHK()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + UNK2700_AIKKJGOLLHK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700AIKKJGOLLHK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE prototype) {
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
     * CmdId: 8226
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_BNABFJBODGE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_BNABFJBODGE)
        io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700BNABFJBODGE.internal_static_Unk2700_BNABFJBODGE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700BNABFJBODGE.internal_static_Unk2700_BNABFJBODGE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE.class, io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE.newBuilder()
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
        stageId_ = 0;

        skillId_ = 0;

        challengeId_ = 0;

        unk2700AIKKJGOLLHK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700BNABFJBODGE.internal_static_Unk2700_BNABFJBODGE_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE build() {
        io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE buildPartial() {
        io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE result = new io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE(this);
        result.stageId_ = stageId_;
        result.skillId_ = skillId_;
        result.challengeId_ = challengeId_;
        result.unk2700AIKKJGOLLHK_ = unk2700AIKKJGOLLHK_;
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
        if (other instanceof io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE) {
          return mergeFrom((io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE other) {
        if (other == io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getUnk2700AIKKJGOLLHK() != 0) {
          setUnk2700AIKKJGOLLHK(other.getUnk2700AIKKJGOLLHK());
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
        io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 12;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 12;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 11;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 11;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 10;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 10;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int unk2700AIKKJGOLLHK_ ;
      /**
       * <code>uint32 Unk2700_AIKKJGOLLHK = 13;</code>
       * @return The unk2700AIKKJGOLLHK.
       */
      @java.lang.Override
      public int getUnk2700AIKKJGOLLHK() {
        return unk2700AIKKJGOLLHK_;
      }
      /**
       * <code>uint32 Unk2700_AIKKJGOLLHK = 13;</code>
       * @param value The unk2700AIKKJGOLLHK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700AIKKJGOLLHK(int value) {
        
        unk2700AIKKJGOLLHK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_AIKKJGOLLHK = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700AIKKJGOLLHK() {
        
        unk2700AIKKJGOLLHK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_BNABFJBODGE)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_BNABFJBODGE)
    private static final io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE();
    }

    public static io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_BNABFJBODGE>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_BNABFJBODGE>() {
      @java.lang.Override
      public Unk2700_BNABFJBODGE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_BNABFJBODGE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_BNABFJBODGE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_BNABFJBODGE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700BNABFJBODGE.Unk2700_BNABFJBODGE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_BNABFJBODGE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_BNABFJBODGE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_BNABFJBODGE.proto\"l\n\023Unk2700_B" +
      "NABFJBODGE\022\020\n\010stage_id\030\014 \001(\r\022\020\n\010skill_id" +
      "\030\013 \001(\r\022\024\n\014challenge_id\030\n \001(\r\022\033\n\023Unk2700_" +
      "AIKKJGOLLHK\030\r \001(\rB\026\n\024io.grasscutter.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_BNABFJBODGE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_BNABFJBODGE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_BNABFJBODGE_descriptor,
        new java.lang.String[] { "StageId", "SkillId", "ChallengeId", "Unk2700AIKKJGOLLHK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}