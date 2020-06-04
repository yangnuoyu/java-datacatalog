/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [UpdateTagTemplate][google.cloud.datacatalog.v1beta1.DataCatalog.UpdateTagTemplate].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest}
 */
public final class UpdateTagTemplateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest)
    UpdateTagTemplateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateTagTemplateRequest.newBuilder() to construct.
  private UpdateTagTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateTagTemplateRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateTagTemplateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateTagTemplateRequest(
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
          case 10:
            {
              com.google.cloud.datacatalog.v1beta1.TagTemplate.Builder subBuilder = null;
              if (tagTemplate_ != null) {
                subBuilder = tagTemplate_.toBuilder();
              }
              tagTemplate_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.v1beta1.TagTemplate.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(tagTemplate_);
                tagTemplate_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_UpdateTagTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_UpdateTagTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest.class,
            com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest.Builder.class);
  }

  public static final int TAG_TEMPLATE_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1beta1.TagTemplate tagTemplate_;
  /**
   *
   *
   * <pre>
   * Required. The template to update. The "name" field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tagTemplate field is set.
   */
  @java.lang.Override
  public boolean hasTagTemplate() {
    return tagTemplate_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The template to update. The "name" field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tagTemplate.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.TagTemplate getTagTemplate() {
    return tagTemplate_ == null
        ? com.google.cloud.datacatalog.v1beta1.TagTemplate.getDefaultInstance()
        : tagTemplate_;
  }
  /**
   *
   *
   * <pre>
   * Required. The template to update. The "name" field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.TagTemplateOrBuilder getTagTemplateOrBuilder() {
    return getTagTemplate();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The field mask specifies the parts of the template to overwrite.
   * Allowed fields:
   *   * `display_name`
   * If absent or empty, all of the allowed fields above will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The field mask specifies the parts of the template to overwrite.
   * Allowed fields:
   *   * `display_name`
   * If absent or empty, all of the allowed fields above will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The field mask specifies the parts of the template to overwrite.
   * Allowed fields:
   *   * `display_name`
   * If absent or empty, all of the allowed fields above will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (tagTemplate_ != null) {
      output.writeMessage(1, getTagTemplate());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tagTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTagTemplate());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest other =
        (com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest) obj;

    if (hasTagTemplate() != other.hasTagTemplate()) return false;
    if (hasTagTemplate()) {
      if (!getTagTemplate().equals(other.getTagTemplate())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasTagTemplate()) {
      hash = (37 * hash) + TAG_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getTagTemplate().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for
   * [UpdateTagTemplate][google.cloud.datacatalog.v1beta1.DataCatalog.UpdateTagTemplate].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest)
      com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_UpdateTagTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_UpdateTagTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest.class,
              com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tagTemplateBuilder_ == null) {
        tagTemplate_ = null;
      } else {
        tagTemplate_ = null;
        tagTemplateBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_UpdateTagTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest
        getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest build() {
      com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest buildPartial() {
      com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest result =
          new com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest(this);
      if (tagTemplateBuilder_ == null) {
        result.tagTemplate_ = tagTemplate_;
      } else {
        result.tagTemplate_ = tagTemplateBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest other) {
      if (other
          == com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest.getDefaultInstance())
        return this;
      if (other.hasTagTemplate()) {
        mergeTagTemplate(other.getTagTemplate());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.datacatalog.v1beta1.TagTemplate tagTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.TagTemplate,
            com.google.cloud.datacatalog.v1beta1.TagTemplate.Builder,
            com.google.cloud.datacatalog.v1beta1.TagTemplateOrBuilder>
        tagTemplateBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The template to update. The "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the tagTemplate field is set.
     */
    public boolean hasTagTemplate() {
      return tagTemplateBuilder_ != null || tagTemplate_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The template to update. The "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The tagTemplate.
     */
    public com.google.cloud.datacatalog.v1beta1.TagTemplate getTagTemplate() {
      if (tagTemplateBuilder_ == null) {
        return tagTemplate_ == null
            ? com.google.cloud.datacatalog.v1beta1.TagTemplate.getDefaultInstance()
            : tagTemplate_;
      } else {
        return tagTemplateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The template to update. The "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTagTemplate(com.google.cloud.datacatalog.v1beta1.TagTemplate value) {
      if (tagTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tagTemplate_ = value;
        onChanged();
      } else {
        tagTemplateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The template to update. The "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTagTemplate(
        com.google.cloud.datacatalog.v1beta1.TagTemplate.Builder builderForValue) {
      if (tagTemplateBuilder_ == null) {
        tagTemplate_ = builderForValue.build();
        onChanged();
      } else {
        tagTemplateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The template to update. The "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTagTemplate(com.google.cloud.datacatalog.v1beta1.TagTemplate value) {
      if (tagTemplateBuilder_ == null) {
        if (tagTemplate_ != null) {
          tagTemplate_ =
              com.google.cloud.datacatalog.v1beta1.TagTemplate.newBuilder(tagTemplate_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          tagTemplate_ = value;
        }
        onChanged();
      } else {
        tagTemplateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The template to update. The "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTagTemplate() {
      if (tagTemplateBuilder_ == null) {
        tagTemplate_ = null;
        onChanged();
      } else {
        tagTemplate_ = null;
        tagTemplateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The template to update. The "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1beta1.TagTemplate.Builder getTagTemplateBuilder() {

      onChanged();
      return getTagTemplateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The template to update. The "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1beta1.TagTemplateOrBuilder getTagTemplateOrBuilder() {
      if (tagTemplateBuilder_ != null) {
        return tagTemplateBuilder_.getMessageOrBuilder();
      } else {
        return tagTemplate_ == null
            ? com.google.cloud.datacatalog.v1beta1.TagTemplate.getDefaultInstance()
            : tagTemplate_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The template to update. The "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.TagTemplate,
            com.google.cloud.datacatalog.v1beta1.TagTemplate.Builder,
            com.google.cloud.datacatalog.v1beta1.TagTemplateOrBuilder>
        getTagTemplateFieldBuilder() {
      if (tagTemplateBuilder_ == null) {
        tagTemplateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1beta1.TagTemplate,
                com.google.cloud.datacatalog.v1beta1.TagTemplate.Builder,
                com.google.cloud.datacatalog.v1beta1.TagTemplateOrBuilder>(
                getTagTemplate(), getParentForChildren(), isClean());
        tagTemplate_ = null;
      }
      return tagTemplateBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The field mask specifies the parts of the template to overwrite.
     * Allowed fields:
     *   * `display_name`
     * If absent or empty, all of the allowed fields above will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The field mask specifies the parts of the template to overwrite.
     * Allowed fields:
     *   * `display_name`
     * If absent or empty, all of the allowed fields above will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The field mask specifies the parts of the template to overwrite.
     * Allowed fields:
     *   * `display_name`
     * If absent or empty, all of the allowed fields above will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The field mask specifies the parts of the template to overwrite.
     * Allowed fields:
     *   * `display_name`
     * If absent or empty, all of the allowed fields above will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The field mask specifies the parts of the template to overwrite.
     * Allowed fields:
     *   * `display_name`
     * If absent or empty, all of the allowed fields above will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The field mask specifies the parts of the template to overwrite.
     * Allowed fields:
     *   * `display_name`
     * If absent or empty, all of the allowed fields above will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The field mask specifies the parts of the template to overwrite.
     * Allowed fields:
     *   * `display_name`
     * If absent or empty, all of the allowed fields above will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The field mask specifies the parts of the template to overwrite.
     * Allowed fields:
     *   * `display_name`
     * If absent or empty, all of the allowed fields above will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The field mask specifies the parts of the template to overwrite.
     * Allowed fields:
     *   * `display_name`
     * If absent or empty, all of the allowed fields above will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest)
  private static final com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest();
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTagTemplateRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTagTemplateRequest>() {
        @java.lang.Override
        public UpdateTagTemplateRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateTagTemplateRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateTagTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTagTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
