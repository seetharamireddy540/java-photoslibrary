// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface FeatureFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.FeatureFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The set of features to be included in the media item search results.
   * The items in the set are ORed and may match any of the specified features.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.FeatureFilter.Feature included_features = 1;</code>
   *
   * @return A list containing the includedFeatures.
   */
  java.util.List<com.google.photos.library.v1.proto.FeatureFilter.Feature>
      getIncludedFeaturesList();
  /**
   *
   *
   * <pre>
   * The set of features to be included in the media item search results.
   * The items in the set are ORed and may match any of the specified features.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.FeatureFilter.Feature included_features = 1;</code>
   *
   * @return The count of includedFeatures.
   */
  int getIncludedFeaturesCount();
  /**
   *
   *
   * <pre>
   * The set of features to be included in the media item search results.
   * The items in the set are ORed and may match any of the specified features.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.FeatureFilter.Feature included_features = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The includedFeatures at the given index.
   */
  com.google.photos.library.v1.proto.FeatureFilter.Feature getIncludedFeatures(int index);
  /**
   *
   *
   * <pre>
   * The set of features to be included in the media item search results.
   * The items in the set are ORed and may match any of the specified features.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.FeatureFilter.Feature included_features = 1;</code>
   *
   * @return A list containing the enum numeric values on the wire for includedFeatures.
   */
  java.util.List<java.lang.Integer> getIncludedFeaturesValueList();
  /**
   *
   *
   * <pre>
   * The set of features to be included in the media item search results.
   * The items in the set are ORed and may match any of the specified features.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.FeatureFilter.Feature included_features = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of includedFeatures at the given index.
   */
  int getIncludedFeaturesValue(int index);
}
