// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tech.proto

package primtech.tech;

public final class Tech {
  private Tech() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntech.proto\022\rprimtech.tech\032\rgeneral.pro" +
      "to2:\n\013TechService\022+\n\007GetTech\022\016.primtech." +
      "Void\032\016.primtech.Void\"\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          primtech.General.getDescriptor(),
        });
    primtech.General.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
