/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;
import org.compiere.util.*;
/** Generated Model for LCO_WithholdingType
 *  @author Adempiere (generated) 
 *  @version Release 3.2.0 - $Id: X_LCO_WithholdingType.java,v 1.3 2007/05/09 10:43:46 cruiz Exp $ */
public class X_LCO_WithholdingType extends PO
{
/** Standard Constructor
@param ctx context
@param LCO_WithholdingType_ID id
@param trxName transaction
*/
public X_LCO_WithholdingType (Properties ctx, int LCO_WithholdingType_ID, String trxName)
{
super (ctx, LCO_WithholdingType_ID, trxName);
/** if (LCO_WithholdingType_ID == 0)
{
setIsSOTrx (false);	// N
setLCO_WithholdingType_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_LCO_WithholdingType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000001 */
public static final int Table_ID=MTable.getTable_ID("LCO_WithholdingType");

/** TableName=LCO_WithholdingType */
public static final String Table_Name="LCO_WithholdingType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"LCO_WithholdingType");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_LCO_WithholdingType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Counter.
@param Counter Count Value */
public void setCounter (int Counter)
{
throw new IllegalArgumentException ("Counter is virtual column");
}
/** Get Counter.
@return Count Value */
public int getCounter() 
{
Integer ii = (Integer)get_Value("Counter");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name Counter */
public static final String COLUMNNAME_Counter = "Counter";
/** Set Description.
@param Description Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
@return Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value ("IsSOTrx", Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value("IsSOTrx");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Withholding Type.
@param LCO_WithholdingType_ID Withholding Type */
public void setLCO_WithholdingType_ID (int LCO_WithholdingType_ID)
{
if (LCO_WithholdingType_ID < 1) throw new IllegalArgumentException ("LCO_WithholdingType_ID is mandatory.");
set_ValueNoCheck ("LCO_WithholdingType_ID", Integer.valueOf(LCO_WithholdingType_ID));
}
/** Get Withholding Type.
@return Withholding Type */
public int getLCO_WithholdingType_ID() 
{
Integer ii = (Integer)get_Value("LCO_WithholdingType_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name LCO_WithholdingType_ID */
public static final String COLUMNNAME_LCO_WithholdingType_ID = "LCO_WithholdingType_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value ("Name", Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
