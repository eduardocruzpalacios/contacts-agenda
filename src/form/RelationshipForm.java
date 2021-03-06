package form;

import gui.Menu;
import model.Relationship;
import tools.In;

public class RelationshipForm {

	public static Relationship getRelationship() {
		boolean exit = false;
		String relationshipString;
		do {
			Menu.relationship();
			relationshipString = In.getString("Relationship:").toUpperCase();
			for (Relationship relationship : Relationship.BY_NAME.values()) {
				if (relationship.toString().equals(relationshipString)) {
					exit = true;
					break;
				}
			}
		} while (!exit);
		return Relationship.valueOf(relationshipString);
	}

}
