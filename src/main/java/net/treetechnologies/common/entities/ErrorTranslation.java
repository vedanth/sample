package net.treetechnologies.common.entities;

import java.io.Serializable;

/**  
* <b>Purpose:</b><br>
* Mutator and Accessor for Offer<br><br>
*
* <b>DesignReference:</b><br>
*  <br><br>
*
* <b>CopyRights:</b><br>
* Tree Technologies 2012<br><br>
*
* <b>RevisionHistory:</b>
* <pre><b>
* Sl No   Modified Date        Author</b>
* ==============================================
* 1        28-3-2012		    Harinatha
* 	-- Base Release	
* 2		   30-03-2012			Harinatha
* 	-- Added ManyToMany Relationships to the  OfferPolicy, OfferSpecification, OfferPrice
* 3		   02-04-2012		    Suresh Upparu
* 	-- Updated the documentation.
* 4        17-04-2012           Suresh Upparu
*   -- Added owningRelations set and getOwningRelations method to get the set of the OfferRelationDetails. 
* 5			27-04-2012			Harinatha
*	-- Added Validation
* 6         29-05-2012          Vedanth
*   -- Added getVersion method to get the active offer version based on the date.
* 7         07-06-2012          Suresh Upparu
*   -- Updated getVersion method to take care if the status is null.  
* </pre><br>
*/
public class ErrorTranslation implements Serializable
{

	/**
	 * <b>Algorithm:</b>
	 * <pre>	 
	 * Adapter class for Marshalling and UnMarshalling of the Offer Ojbect to Long and viseVersa.
	 * </pre>
	 */
	public String getInternalErrorCode() 
	{
		return "Finally................@second";
	}

}
