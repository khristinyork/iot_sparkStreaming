/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.iot.data.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AdvertisingIdActionData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5308734146682358992L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AdvertisingIdActionData\",\"namespace\":\"com.iot.data.schema\",\"fields\":[{\"name\":\"ADVERTISING_ID_KEY\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ADVERTISING_ID_OPTOUT\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String ADVERTISING_ID_KEY;
  @Deprecated public java.lang.String sessionId;
  @Deprecated public java.lang.String appSessionId;
  @Deprecated public java.lang.String timestamp;
  @Deprecated public java.lang.String action;
  @Deprecated public java.lang.Boolean ADVERTISING_ID_OPTOUT;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AdvertisingIdActionData() {}

  /**
   * All-args constructor.
   * @param ADVERTISING_ID_KEY The new value for ADVERTISING_ID_KEY
   * @param sessionId The new value for sessionId
   * @param appSessionId The new value for appSessionId
   * @param timestamp The new value for timestamp
   * @param action The new value for action
   * @param ADVERTISING_ID_OPTOUT The new value for ADVERTISING_ID_OPTOUT
   */
  public AdvertisingIdActionData(java.lang.String ADVERTISING_ID_KEY, java.lang.String sessionId, java.lang.String appSessionId, java.lang.String timestamp, java.lang.String action, java.lang.Boolean ADVERTISING_ID_OPTOUT) {
    this.ADVERTISING_ID_KEY = ADVERTISING_ID_KEY;
    this.sessionId = sessionId;
    this.appSessionId = appSessionId;
    this.timestamp = timestamp;
    this.action = action;
    this.ADVERTISING_ID_OPTOUT = ADVERTISING_ID_OPTOUT;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ADVERTISING_ID_KEY;
    case 1: return sessionId;
    case 2: return appSessionId;
    case 3: return timestamp;
    case 4: return action;
    case 5: return ADVERTISING_ID_OPTOUT;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ADVERTISING_ID_KEY = (java.lang.String)value$; break;
    case 1: sessionId = (java.lang.String)value$; break;
    case 2: appSessionId = (java.lang.String)value$; break;
    case 3: timestamp = (java.lang.String)value$; break;
    case 4: action = (java.lang.String)value$; break;
    case 5: ADVERTISING_ID_OPTOUT = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ADVERTISING_ID_KEY' field.
   * @return The value of the 'ADVERTISING_ID_KEY' field.
   */
  public java.lang.String getADVERTISINGIDKEY() {
    return ADVERTISING_ID_KEY;
  }

  /**
   * Sets the value of the 'ADVERTISING_ID_KEY' field.
   * @param value the value to set.
   */
  public void setADVERTISINGIDKEY(java.lang.String value) {
    this.ADVERTISING_ID_KEY = value;
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
   * Gets the value of the 'ADVERTISING_ID_OPTOUT' field.
   * @return The value of the 'ADVERTISING_ID_OPTOUT' field.
   */
  public java.lang.Boolean getADVERTISINGIDOPTOUT() {
    return ADVERTISING_ID_OPTOUT;
  }

  /**
   * Sets the value of the 'ADVERTISING_ID_OPTOUT' field.
   * @param value the value to set.
   */
  public void setADVERTISINGIDOPTOUT(java.lang.Boolean value) {
    this.ADVERTISING_ID_OPTOUT = value;
  }

  /**
   * Creates a new AdvertisingIdActionData RecordBuilder.
   * @return A new AdvertisingIdActionData RecordBuilder
   */
  public static com.iot.data.schema.AdvertisingIdActionData.Builder newBuilder() {
    return new com.iot.data.schema.AdvertisingIdActionData.Builder();
  }

  /**
   * Creates a new AdvertisingIdActionData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AdvertisingIdActionData RecordBuilder
   */
  public static com.iot.data.schema.AdvertisingIdActionData.Builder newBuilder(com.iot.data.schema.AdvertisingIdActionData.Builder other) {
    return new com.iot.data.schema.AdvertisingIdActionData.Builder(other);
  }

  /**
   * Creates a new AdvertisingIdActionData RecordBuilder by copying an existing AdvertisingIdActionData instance.
   * @param other The existing instance to copy.
   * @return A new AdvertisingIdActionData RecordBuilder
   */
  public static com.iot.data.schema.AdvertisingIdActionData.Builder newBuilder(com.iot.data.schema.AdvertisingIdActionData other) {
    return new com.iot.data.schema.AdvertisingIdActionData.Builder(other);
  }

  /**
   * RecordBuilder for AdvertisingIdActionData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AdvertisingIdActionData>
    implements org.apache.avro.data.RecordBuilder<AdvertisingIdActionData> {

    private java.lang.String ADVERTISING_ID_KEY;
    private java.lang.String sessionId;
    private java.lang.String appSessionId;
    private java.lang.String timestamp;
    private java.lang.String action;
    private java.lang.Boolean ADVERTISING_ID_OPTOUT;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.iot.data.schema.AdvertisingIdActionData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ADVERTISING_ID_KEY)) {
        this.ADVERTISING_ID_KEY = data().deepCopy(fields()[0].schema(), other.ADVERTISING_ID_KEY);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[1].schema(), other.sessionId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.appSessionId)) {
        this.appSessionId = data().deepCopy(fields()[2].schema(), other.appSessionId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.action)) {
        this.action = data().deepCopy(fields()[4].schema(), other.action);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ADVERTISING_ID_OPTOUT)) {
        this.ADVERTISING_ID_OPTOUT = data().deepCopy(fields()[5].schema(), other.ADVERTISING_ID_OPTOUT);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AdvertisingIdActionData instance
     * @param other The existing instance to copy.
     */
    private Builder(com.iot.data.schema.AdvertisingIdActionData other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.ADVERTISING_ID_KEY)) {
        this.ADVERTISING_ID_KEY = data().deepCopy(fields()[0].schema(), other.ADVERTISING_ID_KEY);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[1].schema(), other.sessionId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.appSessionId)) {
        this.appSessionId = data().deepCopy(fields()[2].schema(), other.appSessionId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.action)) {
        this.action = data().deepCopy(fields()[4].schema(), other.action);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ADVERTISING_ID_OPTOUT)) {
        this.ADVERTISING_ID_OPTOUT = data().deepCopy(fields()[5].schema(), other.ADVERTISING_ID_OPTOUT);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'ADVERTISING_ID_KEY' field.
      * @return The value.
      */
    public java.lang.String getADVERTISINGIDKEY() {
      return ADVERTISING_ID_KEY;
    }

    /**
      * Sets the value of the 'ADVERTISING_ID_KEY' field.
      * @param value The value of 'ADVERTISING_ID_KEY'.
      * @return This builder.
      */
    public com.iot.data.schema.AdvertisingIdActionData.Builder setADVERTISINGIDKEY(java.lang.String value) {
      validate(fields()[0], value);
      this.ADVERTISING_ID_KEY = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ADVERTISING_ID_KEY' field has been set.
      * @return True if the 'ADVERTISING_ID_KEY' field has been set, false otherwise.
      */
    public boolean hasADVERTISINGIDKEY() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ADVERTISING_ID_KEY' field.
      * @return This builder.
      */
    public com.iot.data.schema.AdvertisingIdActionData.Builder clearADVERTISINGIDKEY() {
      ADVERTISING_ID_KEY = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public com.iot.data.schema.AdvertisingIdActionData.Builder setSessionId(java.lang.String value) {
      validate(fields()[1], value);
      this.sessionId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sessionId' field has been set.
      * @return True if the 'sessionId' field has been set, false otherwise.
      */
    public boolean hasSessionId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sessionId' field.
      * @return This builder.
      */
    public com.iot.data.schema.AdvertisingIdActionData.Builder clearSessionId() {
      sessionId = null;
      fieldSetFlags()[1] = false;
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
    public com.iot.data.schema.AdvertisingIdActionData.Builder setAppSessionId(java.lang.String value) {
      validate(fields()[2], value);
      this.appSessionId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'appSessionId' field has been set.
      * @return True if the 'appSessionId' field has been set, false otherwise.
      */
    public boolean hasAppSessionId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'appSessionId' field.
      * @return This builder.
      */
    public com.iot.data.schema.AdvertisingIdActionData.Builder clearAppSessionId() {
      appSessionId = null;
      fieldSetFlags()[2] = false;
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
    public com.iot.data.schema.AdvertisingIdActionData.Builder setTimestamp(java.lang.String value) {
      validate(fields()[3], value);
      this.timestamp = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.iot.data.schema.AdvertisingIdActionData.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[3] = false;
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
    public com.iot.data.schema.AdvertisingIdActionData.Builder setAction(java.lang.String value) {
      validate(fields()[4], value);
      this.action = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'action' field has been set.
      * @return True if the 'action' field has been set, false otherwise.
      */
    public boolean hasAction() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'action' field.
      * @return This builder.
      */
    public com.iot.data.schema.AdvertisingIdActionData.Builder clearAction() {
      action = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'ADVERTISING_ID_OPTOUT' field.
      * @return The value.
      */
    public java.lang.Boolean getADVERTISINGIDOPTOUT() {
      return ADVERTISING_ID_OPTOUT;
    }

    /**
      * Sets the value of the 'ADVERTISING_ID_OPTOUT' field.
      * @param value The value of 'ADVERTISING_ID_OPTOUT'.
      * @return This builder.
      */
    public com.iot.data.schema.AdvertisingIdActionData.Builder setADVERTISINGIDOPTOUT(java.lang.Boolean value) {
      validate(fields()[5], value);
      this.ADVERTISING_ID_OPTOUT = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'ADVERTISING_ID_OPTOUT' field has been set.
      * @return True if the 'ADVERTISING_ID_OPTOUT' field has been set, false otherwise.
      */
    public boolean hasADVERTISINGIDOPTOUT() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'ADVERTISING_ID_OPTOUT' field.
      * @return This builder.
      */
    public com.iot.data.schema.AdvertisingIdActionData.Builder clearADVERTISINGIDOPTOUT() {
      ADVERTISING_ID_OPTOUT = null;
      fieldSetFlags()[5] = false;
      return this;
    }

   
    public AdvertisingIdActionData build() {
      try {
        AdvertisingIdActionData record = new AdvertisingIdActionData();
        record.ADVERTISING_ID_KEY = fieldSetFlags()[0] ? this.ADVERTISING_ID_KEY : (java.lang.String) defaultValue(fields()[0]);
        record.sessionId = fieldSetFlags()[1] ? this.sessionId : (java.lang.String) defaultValue(fields()[1]);
        record.appSessionId = fieldSetFlags()[2] ? this.appSessionId : (java.lang.String) defaultValue(fields()[2]);
        record.timestamp = fieldSetFlags()[3] ? this.timestamp : (java.lang.String) defaultValue(fields()[3]);
        record.action = fieldSetFlags()[4] ? this.action : (java.lang.String) defaultValue(fields()[4]);
        record.ADVERTISING_ID_OPTOUT = fieldSetFlags()[5] ? this.ADVERTISING_ID_OPTOUT : (java.lang.Boolean) defaultValue(fields()[5]);
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
