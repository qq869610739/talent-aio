// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/chat.proto

package com.talent.aio.examples.im.common.packets;

/**
 * <pre>
 **
 * 加入群组请求
 * </pre>
 *
 * Protobuf type {@code com.talent.aio.examples.im.common.packets.JoinReqBody}
 */
public  final class JoinReqBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.talent.aio.examples.im.common.packets.JoinReqBody)
    JoinReqBodyOrBuilder {
  // Use JoinReqBody.newBuilder() to construct.
  private JoinReqBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinReqBody() {
    time_ = 0L;
    group_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private JoinReqBody(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            time_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            group_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.talent.aio.examples.im.common.packets.Chat.internal_static_com_talent_aio_examples_im_common_packets_JoinReqBody_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.talent.aio.examples.im.common.packets.Chat.internal_static_com_talent_aio_examples_im_common_packets_JoinReqBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.talent.aio.examples.im.common.packets.JoinReqBody.class, com.talent.aio.examples.im.common.packets.JoinReqBody.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private long time_;
  /**
   * <pre>
   *消息发送时间
   * </pre>
   *
   * <code>int64 time = 1;</code>
   */
  public long getTime() {
    return time_;
  }

  public static final int GROUP_FIELD_NUMBER = 2;
  private volatile java.lang.Object group_;
  /**
   * <code>string group = 2;</code>
   */
  public java.lang.String getGroup() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      group_ = s;
      return s;
    }
  }
  /**
   * <code>string group = 2;</code>
   */
  public com.google.protobuf.ByteString
      getGroupBytes() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      group_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (time_ != 0L) {
      output.writeInt64(1, time_);
    }
    if (!getGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, group_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, time_);
    }
    if (!getGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, group_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.talent.aio.examples.im.common.packets.JoinReqBody)) {
      return super.equals(obj);
    }
    com.talent.aio.examples.im.common.packets.JoinReqBody other = (com.talent.aio.examples.im.common.packets.JoinReqBody) obj;

    boolean result = true;
    result = result && (getTime()
        == other.getTime());
    result = result && getGroup()
        .equals(other.getGroup());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (37 * hash) + GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getGroup().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.talent.aio.examples.im.common.packets.JoinReqBody parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.talent.aio.examples.im.common.packets.JoinReqBody prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   **
   * 加入群组请求
   * </pre>
   *
   * Protobuf type {@code com.talent.aio.examples.im.common.packets.JoinReqBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.talent.aio.examples.im.common.packets.JoinReqBody)
      com.talent.aio.examples.im.common.packets.JoinReqBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.talent.aio.examples.im.common.packets.Chat.internal_static_com_talent_aio_examples_im_common_packets_JoinReqBody_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.talent.aio.examples.im.common.packets.Chat.internal_static_com_talent_aio_examples_im_common_packets_JoinReqBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.talent.aio.examples.im.common.packets.JoinReqBody.class, com.talent.aio.examples.im.common.packets.JoinReqBody.Builder.class);
    }

    // Construct using com.talent.aio.examples.im.common.packets.JoinReqBody.newBuilder()
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
    public Builder clear() {
      super.clear();
      time_ = 0L;

      group_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.talent.aio.examples.im.common.packets.Chat.internal_static_com_talent_aio_examples_im_common_packets_JoinReqBody_descriptor;
    }

    public com.talent.aio.examples.im.common.packets.JoinReqBody getDefaultInstanceForType() {
      return com.talent.aio.examples.im.common.packets.JoinReqBody.getDefaultInstance();
    }

    public com.talent.aio.examples.im.common.packets.JoinReqBody build() {
      com.talent.aio.examples.im.common.packets.JoinReqBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.talent.aio.examples.im.common.packets.JoinReqBody buildPartial() {
      com.talent.aio.examples.im.common.packets.JoinReqBody result = new com.talent.aio.examples.im.common.packets.JoinReqBody(this);
      result.time_ = time_;
      result.group_ = group_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.talent.aio.examples.im.common.packets.JoinReqBody) {
        return mergeFrom((com.talent.aio.examples.im.common.packets.JoinReqBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.talent.aio.examples.im.common.packets.JoinReqBody other) {
      if (other == com.talent.aio.examples.im.common.packets.JoinReqBody.getDefaultInstance()) return this;
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      if (!other.getGroup().isEmpty()) {
        group_ = other.group_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.talent.aio.examples.im.common.packets.JoinReqBody parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.talent.aio.examples.im.common.packets.JoinReqBody) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long time_ ;
    /**
     * <pre>
     *消息发送时间
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public long getTime() {
      return time_;
    }
    /**
     * <pre>
     *消息发送时间
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public Builder setTime(long value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *消息发送时间
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public Builder clearTime() {
      
      time_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object group_ = "";
    /**
     * <code>string group = 2;</code>
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        group_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string group = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string group = 2;</code>
     */
    public Builder setGroup(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      group_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string group = 2;</code>
     */
    public Builder clearGroup() {
      
      group_ = getDefaultInstance().getGroup();
      onChanged();
      return this;
    }
    /**
     * <code>string group = 2;</code>
     */
    public Builder setGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      group_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.talent.aio.examples.im.common.packets.JoinReqBody)
  }

  // @@protoc_insertion_point(class_scope:com.talent.aio.examples.im.common.packets.JoinReqBody)
  private static final com.talent.aio.examples.im.common.packets.JoinReqBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.talent.aio.examples.im.common.packets.JoinReqBody();
  }

  public static com.talent.aio.examples.im.common.packets.JoinReqBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinReqBody>
      PARSER = new com.google.protobuf.AbstractParser<JoinReqBody>() {
    public JoinReqBody parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new JoinReqBody(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JoinReqBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinReqBody> getParserForType() {
    return PARSER;
  }

  public com.talent.aio.examples.im.common.packets.JoinReqBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

