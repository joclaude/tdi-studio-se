package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IDescribeLayout_element  {

      /**
       * element : sObjectType of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getSObjectType();

      public void setSObjectType(java.lang.String sObjectType);

      /**
       * element : layoutName of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getLayoutName();

      public void setLayoutName(java.lang.String layoutName);

      /**
       * element : recordTypeIds of type {urn:partner.soap.sforce.com}ID
       * java type: java.lang.String[]
       */

      public java.lang.String[] getRecordTypeIds();

      public void setRecordTypeIds(java.lang.String[] recordTypeIds);


}
