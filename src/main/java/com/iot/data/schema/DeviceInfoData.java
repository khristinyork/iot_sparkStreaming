/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.iot.data.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DeviceInfoData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8869066835554502255L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DeviceInfoData\",\"namespace\":\"com.iot.data.schema\",\"fields\":[{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"context\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DevInfoContextData\",\"fields\":[{\"name\":\"appBuild\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AppBuildData\",\"fields\":[{\"name\":\"packageName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"versionCode\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"versionName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"device\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DeviceData\",\"fields\":[{\"name\":\"sdkVersion\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"releaseVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceBrand\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceManufacturer\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceModel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceBoard\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceProduct\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"locale\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LocaleData\",\"fields\":[{\"name\":\"deviceCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceLanguage\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"location\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LocationData\",\"fields\":[{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"speed\",\"type\":[\"null\",\"long\"],\"default\":null}]}],\"default\":null},{\"name\":\"telephone\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TelephoneData\",\"fields\":[{\"name\":\"phoneCarrier\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"phoneRadio\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"inRoaming\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"wifi\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"bluetoothInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"BluetoothInfoData\",\"fields\":[{\"name\":\"bluetoothStatus\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"availableMemoryInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AvailableMemoryInfoData\",\"fields\":[{\"name\":\"availableRAM\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"availableStorage\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"cpuInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CpuInfoData\",\"fields\":[{\"name\":\"cpuTotal\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"cpuIdle\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"cpuUsage\",\"type\":[\"null\",\"long\"],\"default\":null}]}],\"default\":null},{\"name\":\"USER_AGENT_ACTION\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"UserAgentActionData\",\"fields\":[{\"name\":\"userAgent\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String sessionId;
  @Deprecated public java.lang.String appSessionId;
  @Deprecated public java.lang.String timestamp;
  @Deprecated public java.lang.String action;
  @Deprecated public com.iot.data.schema.DevInfoContextData context;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DeviceInfoData() {}

  /**
   * All-args constructor.
   * @param sessionId The new value for sessionId
   * @param appSessionId The new value for appSessionId
   * @param timestamp The new value for timestamp
   * @param action The new value for action
   * @param context The new value for context
   */
  public DeviceInfoData(java.lang.String sessionId, java.lang.String appSessionId, java.lang.String timestamp, java.lang.String action, com.iot.data.schema.DevInfoContextData context) {
    this.sessionId = sessionId;
    this.appSessionId = appSessionId;
    this.timestamp = timestamp;
    this.action = action;
    this.context = context;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sessionId;
    case 1: return appSessionId;
    case 2: return timestamp;
    case 3: return action;
    case 4: return context;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sessionId = (java.lang.String)value$; break;
    case 1: appSessionId = (java.lang.String)value$; break;
    case 2: timestamp = (java.lang.String)value$; break;
    case 3: action = (java.lang.String)value$; break;
    case 4: context = (com.iot.data.schema.DevInfoContextData)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'sessionId' field.
   * @return The value of the 'sessionId' field.
   */
  public java.lang.String getSessionId() {
    return sessionId;
  }

  /**
   * Sets the value of the 'sessionId' field.
   * @param value the value to set.
   */
  public void setSessionId(java.lang.String value) {
    this.sessionId = value;
  }

  /**
   * Gets the value of the 'appSessionId' field.
   * @return The value of the 'appSessionId' field.
   */
  public java.lang.String getAppSessionId() {
    return appSessionId;
  }

  /**
   * Sets the value of the 'appSessionId' field.
   * @param value the value to set.
   */
  public void setAppSessionId(java.lang.String value) {
    this.appSessionId = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.String value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'action' field.
   * @return The value of the 'action' field.
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Sets the value of the 'action' field.
   * @param value the value to set.
   */
  public void setAction(java.lang.String value) {
    this.action = value;
  }

  /**
   * Gets the value of the 'context' field.
   * @return The value of the 'context' field.
   */
  public com.iot.data.schema.DevInfoContextData getContext() {
    return context;
  }

  /**
   * Sets the value of the 'context' field.
   * @param value the value to set.
   */
  public void setContext(com.iot.data.schema.DevInfoContextData value) {
    this.context = value;
  }

  /**
   * Creates a new DeviceInfoData RecordBuilder.
   * @return A new DeviceInfoData RecordBuilder
   */
  public static com.iot.data.schema.DeviceInfoData.Builder newBuilder() {
    return new com.iot.data.schema.DeviceInfoData.Builder();
  }

  /**
   * Creates a new DeviceInfoData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DeviceInfoData RecordBuilder
   */
  public static com.iot.data.schema.DeviceInfoData.Builder newBuilder(com.iot.data.schema.DeviceInfoData.Builder other) {
    return new com.iot.data.schema.DeviceInfoData.Builder(other);
  }

  /**
   * Creates a new DeviceInfoData RecordBuilder by copying an existing DeviceInfoData instance.
   * @param other The existing instance to copy.
   * @return A new DeviceInfoData RecordBuilder
   */
  public static com.iot.data.schema.DeviceInfoData.Builder newBuilder(com.iot.data.schema.DeviceInfoData other) {
    return new com.iot.data.schema.DeviceInfoData.Builder(other);
  }

  /**
   * RecordBuilder for DeviceInfoData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DeviceInfoData>
    implements org.apache.avro.data.RecordBuilder<DeviceInfoData> {

    private java.lang.String sessionId;
    private java.lang.String appSessionId;
    private java.lang.String timestamp;
    private java.lang.String action;
    private com.iot.data.schema.DevInfoContextData context;
    private com.iot.data.schema.DevInfoContextData.Builder contextBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.iot.data.schema.DeviceInfoData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[0].schema(), other.sessionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.appSessionId)) {
        this.appSessionId = data().deepCopy(fields()[1].schema(), other.appSessionId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.action)) {
        this.action = data().deepCopy(fields()[3].schema(), other.action);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.context)) {
        this.context = data().deepCopy(fields()[4].schema(), other.context);
        fieldSetFlags()[4] = true;
      }
      if (other.hasContextBuilder()) {
        this.contextBuilder = com.iot.data.schema.DevInfoContextData.newBuilder(other.getContextBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing DeviceInfoData instance
     * @param other The existing instance to copy.
     */
    private Builder(com.iot.data.schema.DeviceInfoData other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[0].schema(), other.sessionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.appSessionId)) {
        this.appSessionId = data().deepCopy(fields()[1].schema(), other.appSessionId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.action)) {
        this.action = data().deepCopy(fields()[3].schema(), other.action);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.context)) {
        this.context = data().deepCopy(fields()[4].schema(), other.context);
        fieldSetFlags()[4] = true;
      }
      this.contextBuilder = null;
    }

    /**
      * Gets the value of the 'sessionId' field.
      * @return The value.
      */
    public java.lang.String getSessionId() {
      return sessionId;
    }

    /**
      * Sets the value of the 'sessionId' field.
      * @param value The value of 'sessionId'.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder setSessionId(java.lang.String value) {
      validate(fields()[0], value);
      this.sessionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'sessionId' field has been set.
      * @return True if the 'sessionId' field has been set, false otherwise.
      */
    public boolean hasSessionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sessionId' field.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder clearSessionId() {
      sessionId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'appSessionId' field.
      * @return The value.
      */
    public java.lang.String getAppSessionId() {
      return appSessionId;
    }

    /**
      * Sets the value of the 'appSessionId' field.
      * @param value The value of 'appSessionId'.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder setAppSessionId(java.lang.String value) {
      validate(fields()[1], value);
      this.appSessionId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'appSessionId' field has been set.
      * @return True if the 'appSessionId' field has been set, false otherwise.
      */
    public boolean hasAppSessionId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'appSessionId' field.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder clearAppSessionId() {
      appSessionId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.String getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder setTimestamp(java.lang.String value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'action' field.
      * @return The value.
      */
    public java.lang.String getAction() {
      return action;
    }

    /**
      * Sets the value of the 'action' field.
      * @param value The value of 'action'.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder setAction(java.lang.String value) {
      validate(fields()[3], value);
      this.action = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'action' field has been set.
      * @return True if the 'action' field has been set, false otherwise.
      */
    public boolean hasAction() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'action' field.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder clearAction() {
      action = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'context' field.
      * @return The value.
      */
    public com.iot.data.schema.DevInfoContextData getContext() {
      return context;
    }

    /**
      * Sets the value of the 'context' field.
      * @param value The value of 'context'.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder setContext(com.iot.data.schema.DevInfoContextData value) {
      validate(fields()[4], value);
      this.contextBuilder = null;
      this.context = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'context' field has been set.
      * @return True if the 'context' field has been set, false otherwise.
      */
    public boolean hasContext() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'context' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.iot.data.schema.DevInfoContextData.Builder getContextBuilder() {
      if (contextBuilder == null) {
        if (hasContext()) {
          setContextBuilder(com.iot.data.schema.DevInfoContextData.newBuilder(context));
        } else {
          setContextBuilder(com.iot.data.schema.DevInfoContextData.newBuilder());
        }
      }
      return contextBuilder;
    }

    /**
     * Sets the Builder instance for the 'context' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.iot.data.schema.DeviceInfoData.Builder setContextBuilder(com.iot.data.schema.DevInfoContextData.Builder value) {
      clearContext();
      contextBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'context' field has an active Builder instance
     * @return True if the 'context' field has an active Builder instance
     */
    public boolean hasContextBuilder() {
      return contextBuilder != null;
    }

    /**
      * Clears the value of the 'context' field.
      * @return This builder.
      */
    public com.iot.data.schema.DeviceInfoData.Builder clearContext() {
      context = null;
      contextBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    public DeviceInfoData build() {
      try {
        DeviceInfoData record = new DeviceInfoData();
        record.sessionId = fieldSetFlags()[0] ? this.sessionId : (java.lang.String) defaultValue(fields()[0]);
        record.appSessionId = fieldSetFlags()[1] ? this.appSessionId : (java.lang.String) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.String) defaultValue(fields()[2]);
        record.action = fieldSetFlags()[3] ? this.action : (java.lang.String) defaultValue(fields()[3]);
        if (contextBuilder != null) {
          record.context = this.contextBuilder.build();
        } else {
          record.context = fieldSetFlags()[4] ? this.context : (com.iot.data.schema.DevInfoContextData) defaultValue(fields()[4]);
        }
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
