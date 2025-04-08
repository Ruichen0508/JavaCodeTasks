// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CarService.proto

package grpc.carservice;

public final class CarServiceProto {
  private CarServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_AddNewCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_AddNewCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_AddNewCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_AddNewCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_SetCarColorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_SetCarColorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_MoveCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_MoveCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_MoveCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_MoveCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_SetCarNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_SetCarNameRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020CarService.proto\022\010grpc.ex1\032\033google/pro" +
      "tobuf/empty.proto\"/\n\020AddNewCarRequest\022\014\n" +
      "\004name\030\001 \001(\t\022\r\n\005color\030\002 \001(\t\"%\n\021AddNewCarR" +
      "esponse\022\020\n\010carIndex\030\001 \001(\005\"5\n\022SetCarColor" +
      "Request\022\020\n\010carIndex\030\001 \001(\005\022\r\n\005color\030\002 \001(\t" +
      "\"Y\n\016MoveCarRequest\022\020\n\010carIndex\030\001 \001(\005\022&\n\t" +
      "direction\030\002 \001(\0162\023.grpc.ex1.Direction\022\r\n\005" +
      "count\030\003 \001(\005\"!\n\017MoveCarResponse\022\016\n\006result" +
      "\030\001 \001(\010\"3\n\021SetCarNameRequest\022\020\n\010carIndex\030" +
      "\001 \001(\005\022\014\n\004name\030\002 \001(\t*2\n\tDirection\022\006\n\002UP\020\000",
      "\022\010\n\004DOWN\020\001\022\010\n\004LEFT\020\002\022\t\n\005RIGHT\020\0032\232\002\n\nCarS" +
      "ervice\022D\n\tcreateCar\022\032.grpc.ex1.AddNewCar" +
      "Request\032\033.grpc.ex1.AddNewCarResponse\022C\n\013" +
      "setCarColor\022\034.grpc.ex1.SetCarColorReques" +
      "t\032\026.google.protobuf.Empty\022>\n\007moveCar\022\030.g" +
      "rpc.ex1.MoveCarRequest\032\031.grpc.ex1.MoveCa" +
      "rResponse\022A\n\nsetCarName\022\033.grpc.ex1.SetCa" +
      "rNameRequest\032\026.google.protobuf.EmptyB$\n\017" +
      "grpc.carserviceB\017CarServiceProtoP\001b\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_grpc_ex1_AddNewCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_ex1_AddNewCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_AddNewCarRequest_descriptor,
        new java.lang.String[] { "Name", "Color", });
    internal_static_grpc_ex1_AddNewCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_ex1_AddNewCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_AddNewCarResponse_descriptor,
        new java.lang.String[] { "CarIndex", });
    internal_static_grpc_ex1_SetCarColorRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpc_ex1_SetCarColorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_SetCarColorRequest_descriptor,
        new java.lang.String[] { "CarIndex", "Color", });
    internal_static_grpc_ex1_MoveCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpc_ex1_MoveCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_MoveCarRequest_descriptor,
        new java.lang.String[] { "CarIndex", "Direction", "Count", });
    internal_static_grpc_ex1_MoveCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpc_ex1_MoveCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_MoveCarResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_grpc_ex1_SetCarNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grpc_ex1_SetCarNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_SetCarNameRequest_descriptor,
        new java.lang.String[] { "CarIndex", "Name", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
