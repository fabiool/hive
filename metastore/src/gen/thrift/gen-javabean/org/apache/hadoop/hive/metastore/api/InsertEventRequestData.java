/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertEventRequestData implements org.apache.thrift.TBase<InsertEventRequestData, InsertEventRequestData._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InsertEventRequestData");

  private static final org.apache.thrift.protocol.TField FILES_ADDED_FIELD_DESC = new org.apache.thrift.protocol.TField("filesAdded", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InsertEventRequestDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InsertEventRequestDataTupleSchemeFactory());
  }

  private List<String> filesAdded; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILES_ADDED((short)1, "filesAdded");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FILES_ADDED
          return FILES_ADDED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILES_ADDED, new org.apache.thrift.meta_data.FieldMetaData("filesAdded", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InsertEventRequestData.class, metaDataMap);
  }

  public InsertEventRequestData() {
  }

  public InsertEventRequestData(
    List<String> filesAdded)
  {
    this();
    this.filesAdded = filesAdded;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InsertEventRequestData(InsertEventRequestData other) {
    if (other.isSetFilesAdded()) {
      List<String> __this__filesAdded = new ArrayList<String>();
      for (String other_element : other.filesAdded) {
        __this__filesAdded.add(other_element);
      }
      this.filesAdded = __this__filesAdded;
    }
  }

  public InsertEventRequestData deepCopy() {
    return new InsertEventRequestData(this);
  }

  @Override
  public void clear() {
    this.filesAdded = null;
  }

  public int getFilesAddedSize() {
    return (this.filesAdded == null) ? 0 : this.filesAdded.size();
  }

  public java.util.Iterator<String> getFilesAddedIterator() {
    return (this.filesAdded == null) ? null : this.filesAdded.iterator();
  }

  public void addToFilesAdded(String elem) {
    if (this.filesAdded == null) {
      this.filesAdded = new ArrayList<String>();
    }
    this.filesAdded.add(elem);
  }

  public List<String> getFilesAdded() {
    return this.filesAdded;
  }

  public void setFilesAdded(List<String> filesAdded) {
    this.filesAdded = filesAdded;
  }

  public void unsetFilesAdded() {
    this.filesAdded = null;
  }

  /** Returns true if field filesAdded is set (has been assigned a value) and false otherwise */
  public boolean isSetFilesAdded() {
    return this.filesAdded != null;
  }

  public void setFilesAddedIsSet(boolean value) {
    if (!value) {
      this.filesAdded = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILES_ADDED:
      if (value == null) {
        unsetFilesAdded();
      } else {
        setFilesAdded((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILES_ADDED:
      return getFilesAdded();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILES_ADDED:
      return isSetFilesAdded();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InsertEventRequestData)
      return this.equals((InsertEventRequestData)that);
    return false;
  }

  public boolean equals(InsertEventRequestData that) {
    if (that == null)
      return false;

    boolean this_present_filesAdded = true && this.isSetFilesAdded();
    boolean that_present_filesAdded = true && that.isSetFilesAdded();
    if (this_present_filesAdded || that_present_filesAdded) {
      if (!(this_present_filesAdded && that_present_filesAdded))
        return false;
      if (!this.filesAdded.equals(that.filesAdded))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_filesAdded = true && (isSetFilesAdded());
    builder.append(present_filesAdded);
    if (present_filesAdded)
      builder.append(filesAdded);

    return builder.toHashCode();
  }

  public int compareTo(InsertEventRequestData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    InsertEventRequestData typedOther = (InsertEventRequestData)other;

    lastComparison = Boolean.valueOf(isSetFilesAdded()).compareTo(typedOther.isSetFilesAdded());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilesAdded()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filesAdded, typedOther.filesAdded);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InsertEventRequestData(");
    boolean first = true;

    sb.append("filesAdded:");
    if (this.filesAdded == null) {
      sb.append("null");
    } else {
      sb.append(this.filesAdded);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetFilesAdded()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'filesAdded' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InsertEventRequestDataStandardSchemeFactory implements SchemeFactory {
    public InsertEventRequestDataStandardScheme getScheme() {
      return new InsertEventRequestDataStandardScheme();
    }
  }

  private static class InsertEventRequestDataStandardScheme extends StandardScheme<InsertEventRequestData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InsertEventRequestData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILES_ADDED
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list508 = iprot.readListBegin();
                struct.filesAdded = new ArrayList<String>(_list508.size);
                for (int _i509 = 0; _i509 < _list508.size; ++_i509)
                {
                  String _elem510; // optional
                  _elem510 = iprot.readString();
                  struct.filesAdded.add(_elem510);
                }
                iprot.readListEnd();
              }
              struct.setFilesAddedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, InsertEventRequestData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.filesAdded != null) {
        oprot.writeFieldBegin(FILES_ADDED_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.filesAdded.size()));
          for (String _iter511 : struct.filesAdded)
          {
            oprot.writeString(_iter511);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InsertEventRequestDataTupleSchemeFactory implements SchemeFactory {
    public InsertEventRequestDataTupleScheme getScheme() {
      return new InsertEventRequestDataTupleScheme();
    }
  }

  private static class InsertEventRequestDataTupleScheme extends TupleScheme<InsertEventRequestData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InsertEventRequestData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.filesAdded.size());
        for (String _iter512 : struct.filesAdded)
        {
          oprot.writeString(_iter512);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InsertEventRequestData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list513 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.filesAdded = new ArrayList<String>(_list513.size);
        for (int _i514 = 0; _i514 < _list513.size; ++_i514)
        {
          String _elem515; // optional
          _elem515 = iprot.readString();
          struct.filesAdded.add(_elem515);
        }
      }
      struct.setFilesAddedIsSet(true);
    }
  }

}
