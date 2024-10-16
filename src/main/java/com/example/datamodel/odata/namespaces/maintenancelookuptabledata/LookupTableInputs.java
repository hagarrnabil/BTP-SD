
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.6.0
 */

package com.example.datamodel.odata.namespaces.maintenancelookuptabledata;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.example.datamodel.odata.services.MaintenanceLookupTableDataService;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.sap.cloud.sdk.datamodel.odata.client.request.ODataEntityKey;
import com.sap.cloud.sdk.datamodel.odatav4.core.SimpleProperty;
import com.sap.cloud.sdk.datamodel.odatav4.core.VdmEntity;
import com.sap.cloud.sdk.datamodel.odatav4.core.VdmEntitySet;
import com.sap.cloud.sdk.result.ElementName;
import io.vavr.control.Option;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>LookupTableInputs</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.datamodel.odatav4.adapter.GsonVdmAdapterFactory.class)
@JsonSerialize(using = com.sap.cloud.sdk.datamodel.odatav4.adapter.JacksonVdmObjectSerializer.class)
@JsonDeserialize(using = com.sap.cloud.sdk.datamodel.odatav4.adapter.JacksonVdmObjectDeserializer.class)
public class LookupTableInputs
    extends VdmEntity<LookupTableInputs>
    implements VdmEntitySet
{

    @Getter
    private final java.lang.String odataType = "MaintenanceLookupTableDataService.LookupTableInputs";
    /**
     * Selector for all available fields of LookupTableInputs.
     * 
     */
    public final static SimpleProperty<LookupTableInputs> ALL_FIELDS = all();
    /**
     * Constraints: Nullable, Maximum length: 2000 <p>Original property name from the Odata EDM: <b>description</b></p>
     * 
     * @return
     *     Description
     */
    @Nullable
    @ElementName("description")
    private java.lang.String description;
    public final static SimpleProperty.String<LookupTableInputs> DESCRIPTION = new SimpleProperty.String<LookupTableInputs>(LookupTableInputs.class, "description");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>code</b></p>
     * 
     * @return
     *     The code contained in this {@link VdmEntity}.
     */
    @Nullable
    @ElementName("code")
    private java.lang.String code;
    public final static SimpleProperty.String<LookupTableInputs> CODE = new SimpleProperty.String<LookupTableInputs>(LookupTableInputs.class, "code");
    /**
     * Constraints: Nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>lookupTable_code</b></p>
     * 
     * @return
     *     The lookupTable_code contained in this {@link VdmEntity}.
     */
    @Nullable
    @ElementName("lookupTable_code")
    private java.lang.String lookupTable_code;
    public final static SimpleProperty.String<LookupTableInputs> LOOKUP_TABLE_CODE = new SimpleProperty.String<LookupTableInputs>(LookupTableInputs.class, "lookupTable_code");
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>index</b></p>
     * 
     * @return
     *     The index contained in this {@link VdmEntity}.
     */
    @Nullable
    @ElementName("index")
    private Integer index;
    public final static SimpleProperty.NumericInteger<LookupTableInputs> INDEX = new SimpleProperty.NumericInteger<LookupTableInputs>(LookupTableInputs.class, "index");
    /**
     * Constraints: Nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>type</b></p>
     * 
     * @return
     *     The type_2 contained in this {@link VdmEntity}.
     */
    @Nullable
    @ElementName("type")
    private java.lang.String type_2;
    public final static SimpleProperty.String<LookupTableInputs> TYPE_2 = new SimpleProperty.String<LookupTableInputs>(LookupTableInputs.class, "type");
    /**
     * Navigation property <b>lookupTable</b> for <b>LookupTableInputs</b> to single <b>LookupTables</b>.
     * 
     */
    @ElementName("lookupTable")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private LookupTables toLookupTable;
    /**
     * Use with available request builders to apply the <b>lookupTable</b> navigation property to query operations.
     * 
     */
    public final static com.sap.cloud.sdk.datamodel.odatav4.core.NavigationProperty.Single<LookupTableInputs, LookupTables> TO_LOOKUP_TABLE = new com.sap.cloud.sdk.datamodel.odatav4.core.NavigationProperty.Single<LookupTableInputs, LookupTables>(LookupTableInputs.class, "lookupTable", LookupTables.class);

    @Nonnull
    @Override
    public Class<LookupTableInputs> getType() {
        return LookupTableInputs.class;
    }

    /**
     * Constraints: Nullable, Maximum length: 2000 <p>Original property name from the Odata EDM: <b>description</b></p>
     * 
     * @param description
     *     Description
     */
    public void setDescription(
        @Nullable
        final java.lang.String description) {
        rememberChangedField("description", this.description);
        this.description = description;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>code</b></p>
     * 
     * @param code
     *     The code to set.
     */
    public void setCode(
        @Nullable
        final java.lang.String code) {
        rememberChangedField("code", this.code);
        this.code = code;
    }

    /**
     * Constraints: Nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>lookupTable_code</b></p>
     * 
     * @param lookupTable_code
     *     The lookupTable_code to set.
     */
    public void setLookupTable_code(
        @Nullable
        final java.lang.String lookupTable_code) {
        rememberChangedField("lookupTable_code", this.lookupTable_code);
        this.lookupTable_code = lookupTable_code;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>index</b></p>
     * 
     * @param index
     *     The index to set.
     */
    public void setIndex(
        @Nullable
        final Integer index) {
        rememberChangedField("index", this.index);
        this.index = index;
    }

    /**
     * Constraints: Nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>type</b></p>
     * 
     * @param type_2
     *     The type_2 to set.
     */
    public void setType_2(
        @Nullable
        final java.lang.String type_2) {
        rememberChangedField("type", this.type_2);
        this.type_2 = type_2;
    }

    @Override
    protected java.lang.String getEntityCollection() {
        return "LookupTableInputs";
    }

    @Nonnull
    @Override
    protected ODataEntityKey getKey() {
        final ODataEntityKey entityKey = super.getKey();
        entityKey.addKeyProperty("code", getCode());
        return entityKey;
    }

    @Nonnull
    @Override
    protected Map<java.lang.String, Object> toMapOfFields() {
        final Map<java.lang.String, Object> values = super.toMapOfFields();
        values.put("description", getDescription());
        values.put("code", getCode());
        values.put("lookupTable_code", getLookupTable_code());
        values.put("index", getIndex());
        values.put("type", getType_2());
        return values;
    }

    @Override
    protected void fromMap(final Map<java.lang.String, Object> inputValues) {
        final Map<java.lang.String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("description")) {
                final Object value = values.remove("description");
                if ((value == null)||(!value.equals(getDescription()))) {
                    setDescription(((java.lang.String) value));
                }
            }
            if (values.containsKey("code")) {
                final Object value = values.remove("code");
                if ((value == null)||(!value.equals(getCode()))) {
                    setCode(((java.lang.String) value));
                }
            }
            if (values.containsKey("lookupTable_code")) {
                final Object value = values.remove("lookupTable_code");
                if ((value == null)||(!value.equals(getLookupTable_code()))) {
                    setLookupTable_code(((java.lang.String) value));
                }
            }
            if (values.containsKey("index")) {
                final Object value = values.remove("index");
                if ((value == null)||(!value.equals(getIndex()))) {
                    setIndex(((Integer) value));
                }
            }
            if (values.containsKey("type")) {
                final Object value = values.remove("type");
                if ((value == null)||(!value.equals(getType_2()))) {
                    setType_2(((java.lang.String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("lookupTable")) {
                final Object value = (values).remove("lookupTable");
                if (value instanceof Map) {
                    if (toLookupTable == null) {
                        toLookupTable = new LookupTables();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<java.lang.String, Object> inputMap = ((Map<java.lang.String, Object> ) value);
                    toLookupTable.fromMap(inputMap);
                }
            }
        }
        super.fromMap(values);
    }

    @Override
    protected java.lang.String getDefaultServicePath() {
        return MaintenanceLookupTableDataService.DEFAULT_SERVICE_PATH;
    }

    @Nonnull
    @Override
    protected Map<java.lang.String, Object> toMapOfNavigationProperties() {
        final Map<java.lang.String, Object> values = super.toMapOfNavigationProperties();
        if (toLookupTable!= null) {
            (values).put("lookupTable", toLookupTable);
        }
        return values;
    }

    /**
     * Retrieval of associated <b>LookupTables</b> entity (one to one). This corresponds to the OData navigation property <b>lookupTable</b>.
     * <p>
     * If the navigation property for an entity <b>LookupTableInputs</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Option</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>lookupTable</b> is already loaded, the result will contain the <b>LookupTables</b> entity. If not, an <code>Option</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Option<LookupTables> getLookupTableIfPresent() {
        return Option.of(toLookupTable);
    }

    /**
     * Overwrites the associated <b>LookupTables</b> entity for the loaded navigation property <b>lookupTable</b>.
     * 
     * @param value
     *     New <b>LookupTables</b> entity.
     */
    public void setLookupTable(final LookupTables value) {
        toLookupTable = value;
    }


    /**
     * Helper class to allow for fluent creation of LookupTableInputs instances.
     * 
     */
    public final static class LookupTableInputsBuilder {

        private LookupTables toLookupTable;

        private LookupTableInputs.LookupTableInputsBuilder toLookupTable(final LookupTables value) {
            toLookupTable = value;
            return this;
        }

        /**
         * Navigation property <b>lookupTable</b> for <b>LookupTableInputs</b> to single <b>LookupTables</b>.
         * 
         * @param value
         *     The LookupTables to build this LookupTableInputs with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public LookupTableInputs.LookupTableInputsBuilder lookupTable(final LookupTables value) {
            return toLookupTable(value);
        }

    }

}
