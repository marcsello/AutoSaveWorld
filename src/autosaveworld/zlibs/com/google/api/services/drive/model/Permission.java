/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-10-17 16:43:55 UTC)
 * on 2016-11-17 at 13:55:42 UTC 
 * Modify at your own risk.
 */

package autosaveworld.zlibs.com.google.api.services.drive.model;

/**
 * A permission for a file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Permission extends autosaveworld.zlibs.com.google.api.client.json.GenericJson {

  /**
   * Additional roles for this user. Only commenter is currently allowed.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.util.List<java.lang.String> additionalRoles;

  /**
   * The authkey parameter required for this permission.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String authKey;

  /**
   * The domain name of the entity this permission refers to. This is an output-only field which is
   * present when the permission type is user, group or domain.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * The email address of the user or group this permission refers to. This is an output-only field
   * which is present when the permission type is user or group.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String emailAddress;

  /**
   * The ETag of the permission.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The time at which this permission will expire (RFC 3339 date-time).
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private autosaveworld.zlibs.com.google.api.client.util.DateTime expirationDate;

  /**
   * The ID of the user this permission refers to, and identical to the permissionId in the About
   * and Files resources. When making a drive.permissions.insert request, exactly one of the id or
   * value fields must be specified unless the permission type anyone, in which case both id and
   * value are ignored.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * This is always drive#permission.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name for this permission.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A link to the profile photo, if available.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String photoLink;

  /**
   * The primary role for this user. Allowed values are: - owner  - reader  - writer
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * A link back to this permission.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The account type. Allowed values are: - user  - group  - domain  - anyone
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The email address or domain name for the entity. This is used during inserts and is not
   * populated in responses. When making a drive.permissions.insert request, exactly one of the id
   * or value fields must be specified unless the permission type anyone, in which case both id and
   * value are ignored.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Whether the link is required for this permission.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.Boolean withLink;

  /**
   * Additional roles for this user. Only commenter is currently allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdditionalRoles() {
    return additionalRoles;
  }

  /**
   * Additional roles for this user. Only commenter is currently allowed.
   * @param additionalRoles additionalRoles or {@code null} for none
   */
  public Permission setAdditionalRoles(java.util.List<java.lang.String> additionalRoles) {
    this.additionalRoles = additionalRoles;
    return this;
  }

  /**
   * The authkey parameter required for this permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthKey() {
    return authKey;
  }

  /**
   * The authkey parameter required for this permission.
   * @param authKey authKey or {@code null} for none
   */
  public Permission setAuthKey(java.lang.String authKey) {
    this.authKey = authKey;
    return this;
  }

  /**
   * The domain name of the entity this permission refers to. This is an output-only field which is
   * present when the permission type is user, group or domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * The domain name of the entity this permission refers to. This is an output-only field which is
   * present when the permission type is user, group or domain.
   * @param domain domain or {@code null} for none
   */
  public Permission setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The email address of the user or group this permission refers to. This is an output-only field
   * which is present when the permission type is user or group.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailAddress() {
    return emailAddress;
  }

  /**
   * The email address of the user or group this permission refers to. This is an output-only field
   * which is present when the permission type is user or group.
   * @param emailAddress emailAddress or {@code null} for none
   */
  public Permission setEmailAddress(java.lang.String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The ETag of the permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The ETag of the permission.
   * @param etag etag or {@code null} for none
   */
  public Permission setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The time at which this permission will expire (RFC 3339 date-time).
   * @return value or {@code null} for none
   */
  public autosaveworld.zlibs.com.google.api.client.util.DateTime getExpirationDate() {
    return expirationDate;
  }

  /**
   * The time at which this permission will expire (RFC 3339 date-time).
   * @param expirationDate expirationDate or {@code null} for none
   */
  public Permission setExpirationDate(autosaveworld.zlibs.com.google.api.client.util.DateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The ID of the user this permission refers to, and identical to the permissionId in the About
   * and Files resources. When making a drive.permissions.insert request, exactly one of the id or
   * value fields must be specified unless the permission type anyone, in which case both id and
   * value are ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the user this permission refers to, and identical to the permissionId in the About
   * and Files resources. When making a drive.permissions.insert request, exactly one of the id or
   * value fields must be specified unless the permission type anyone, in which case both id and
   * value are ignored.
   * @param id id or {@code null} for none
   */
  public Permission setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * This is always drive#permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always drive#permission.
   * @param kind kind or {@code null} for none
   */
  public Permission setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name for this permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name for this permission.
   * @param name name or {@code null} for none
   */
  public Permission setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A link to the profile photo, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotoLink() {
    return photoLink;
  }

  /**
   * A link to the profile photo, if available.
   * @param photoLink photoLink or {@code null} for none
   */
  public Permission setPhotoLink(java.lang.String photoLink) {
    this.photoLink = photoLink;
    return this;
  }

  /**
   * The primary role for this user. Allowed values are: - owner  - reader  - writer
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * The primary role for this user. Allowed values are: - owner  - reader  - writer
   * @param role role or {@code null} for none
   */
  public Permission setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * A link back to this permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * A link back to this permission.
   * @param selfLink selfLink or {@code null} for none
   */
  public Permission setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The account type. Allowed values are: - user  - group  - domain  - anyone
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The account type. Allowed values are: - user  - group  - domain  - anyone
   * @param type type or {@code null} for none
   */
  public Permission setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The email address or domain name for the entity. This is used during inserts and is not
   * populated in responses. When making a drive.permissions.insert request, exactly one of the id
   * or value fields must be specified unless the permission type anyone, in which case both id and
   * value are ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The email address or domain name for the entity. This is used during inserts and is not
   * populated in responses. When making a drive.permissions.insert request, exactly one of the id
   * or value fields must be specified unless the permission type anyone, in which case both id and
   * value are ignored.
   * @param value value or {@code null} for none
   */
  public Permission setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * Whether the link is required for this permission.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWithLink() {
    return withLink;
  }

  /**
   * Whether the link is required for this permission.
   * @param withLink withLink or {@code null} for none
   */
  public Permission setWithLink(java.lang.Boolean withLink) {
    this.withLink = withLink;
    return this;
  }

  @Override
  public Permission set(String fieldName, Object value) {
    return (Permission) super.set(fieldName, value);
  }

  @Override
  public Permission clone() {
    return (Permission) super.clone();
  }

}