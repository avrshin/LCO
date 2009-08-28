/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.globalqss.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.model.*;

/** Generated Model for LCO_DIAN_SendSchedule
 *  @author Adempiere (generated) 
 *  @version Release 3.4.2s - $Id$ */
public class X_LCO_DIAN_SendSchedule extends PO implements I_LCO_DIAN_SendSchedule, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_LCO_DIAN_SendSchedule (Properties ctx, int LCO_DIAN_SendSchedule_ID, String trxName)
    {
      super (ctx, LCO_DIAN_SendSchedule_ID, trxName);
      /** if (LCO_DIAN_SendSchedule_ID == 0)
        {
			setC_Year_ID (0);
			setIsGenerated (false);
// N
			setLCO_DIAN_Format_ID (0);
			setLCO_DIAN_SendSchedule_ID (0);
			setProcessed (false);
			setSendConceptCode (null);
        } */
    }

    /** Load Constructor */
    public X_LCO_DIAN_SendSchedule (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_LCO_DIAN_SendSchedule[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_Year getC_Year() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_C_Year.Table_Name);
        I_C_Year result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_Year)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_Year_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Year.
		@param C_Year_ID 
		Calendar Year
	  */
	public void setC_Year_ID (int C_Year_ID)
	{
		if (C_Year_ID < 1)
			 throw new IllegalArgumentException ("C_Year_ID is mandatory.");
		set_Value (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
	}

	/** Get Year.
		@return Calendar Year
	  */
	public int getC_Year_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set End Date.
		@param EndDate 
		Last effective date (inclusive)
	  */
	public void setEndDate (Timestamp EndDate)
	{
		set_Value (COLUMNNAME_EndDate, EndDate);
	}

	/** Get End Date.
		@return Last effective date (inclusive)
	  */
	public Timestamp getEndDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EndDate);
	}

	/** Set Generate XML.
		@param GenerateXML Generate XML	  */
	public void setGenerateXML (String GenerateXML)
	{

		if (GenerateXML != null && GenerateXML.length() > 1)
		{
			log.warning("Length > 1 - truncated");
			GenerateXML = GenerateXML.substring(0, 1);
		}
		set_Value (COLUMNNAME_GenerateXML, GenerateXML);
	}

	/** Get Generate XML.
		@return Generate XML	  */
	public String getGenerateXML () 
	{
		return (String)get_Value(COLUMNNAME_GenerateXML);
	}

	/** Set Generated.
		@param IsGenerated 
		This Line is generated
	  */
	public void setIsGenerated (boolean IsGenerated)
	{
		set_ValueNoCheck (COLUMNNAME_IsGenerated, Boolean.valueOf(IsGenerated));
	}

	/** Get Generated.
		@return This Line is generated
	  */
	public boolean isGenerated () 
	{
		Object oo = get_Value(COLUMNNAME_IsGenerated);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** LCO_DIAN_Format_ID AD_Reference_ID=1000007 */
	public static final int LCO_DIAN_FORMAT_ID_AD_Reference_ID=1000007;
	/** Set DIAN Format.
		@param LCO_DIAN_Format_ID DIAN Format	  */
	public void setLCO_DIAN_Format_ID (int LCO_DIAN_Format_ID)
	{
		if (LCO_DIAN_Format_ID < 1)
			 throw new IllegalArgumentException ("LCO_DIAN_Format_ID is mandatory.");
		set_Value (COLUMNNAME_LCO_DIAN_Format_ID, Integer.valueOf(LCO_DIAN_Format_ID));
	}

	/** Get DIAN Format.
		@return DIAN Format	  */
	public int getLCO_DIAN_Format_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LCO_DIAN_Format_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DIAN Send Schedule.
		@param LCO_DIAN_SendSchedule_ID DIAN Send Schedule	  */
	public void setLCO_DIAN_SendSchedule_ID (int LCO_DIAN_SendSchedule_ID)
	{
		if (LCO_DIAN_SendSchedule_ID < 1)
			 throw new IllegalArgumentException ("LCO_DIAN_SendSchedule_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_LCO_DIAN_SendSchedule_ID, Integer.valueOf(LCO_DIAN_SendSchedule_ID));
	}

	/** Get DIAN Send Schedule.
		@return DIAN Send Schedule	  */
	public int getLCO_DIAN_SendSchedule_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LCO_DIAN_SendSchedule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Process Content.
		@param ProcessContent Process Content	  */
	public void setProcessContent (String ProcessContent)
	{

		if (ProcessContent != null && ProcessContent.length() > 1)
		{
			log.warning("Length > 1 - truncated");
			ProcessContent = ProcessContent.substring(0, 1);
		}
		set_Value (COLUMNNAME_ProcessContent, ProcessContent);
	}

	/** Get Process Content.
		@return Process Content	  */
	public String getProcessContent () 
	{
		return (String)get_Value(COLUMNNAME_ProcessContent);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_ValueNoCheck (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** SendConceptCode AD_Reference_ID=1000006 */
	public static final int SENDCONCEPTCODE_AD_Reference_ID=1000006;
	/** Insertion = 1 */
	public static final String SENDCONCEPTCODE_Insertion = "1";
	/** Substitution = 2 */
	public static final String SENDCONCEPTCODE_Substitution = "2";
	/** Set Send Concept Code.
		@param SendConceptCode Send Concept Code	  */
	public void setSendConceptCode (String SendConceptCode)
	{
		if (SendConceptCode == null) throw new IllegalArgumentException ("SendConceptCode is mandatory");
		if (SendConceptCode.equals("1") || SendConceptCode.equals("2")); else throw new IllegalArgumentException ("SendConceptCode Invalid value - " + SendConceptCode + " - Reference_ID=1000006 - 1 - 2");
		if (SendConceptCode.length() > 2)
		{
			log.warning("Length > 2 - truncated");
			SendConceptCode = SendConceptCode.substring(0, 2);
		}
		set_Value (COLUMNNAME_SendConceptCode, SendConceptCode);
	}

	/** Get Send Concept Code.
		@return Send Concept Code	  */
	public String getSendConceptCode () 
	{
		return (String)get_Value(COLUMNNAME_SendConceptCode);
	}

	/** Set Send Date.
		@param SendDate Send Date	  */
	public void setSendDate (Timestamp SendDate)
	{
		set_Value (COLUMNNAME_SendDate, SendDate);
	}

	/** Get Send Date.
		@return Send Date	  */
	public Timestamp getSendDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_SendDate);
	}

	/** Set Start Date.
		@param StartDate 
		First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate)
	{
		set_Value (COLUMNNAME_StartDate, StartDate);
	}

	/** Get Start Date.
		@return First effective day (inclusive)
	  */
	public Timestamp getStartDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_StartDate);
	}
}