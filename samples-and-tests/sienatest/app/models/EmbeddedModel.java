package models;

import play.modules.siena.Model;
import siena.Generator;
import siena.Id;
import siena.Table;
import siena.embed.EmbeddedMap;

@Table("embedded_models")
@EmbeddedMap
public class EmbeddedModel extends Model{
    @Id(Generator.NONE)
    public String id;
    
    public String 	alpha;
    public short	beta;
    
    public String toString() {
    	return id + " " + alpha + " " + beta;
    }
}
