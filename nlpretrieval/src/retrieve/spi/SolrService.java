package retrieve.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SolrService extends FullTextServiceImcpl {
	
	// data needs to be indexed
	private List<Map<String,Object>> indexData = new ArrayList<Map<String,Object>>();

	// lucence index path
	private String indexPath= "";
	
	public List<Map<String,Object>> getIndexData(){
		return indexData;
	}
	
	public void setIndexData(List<Map<String,Object>> idxData){
		this.indexData = idxData;
	}
	
	public String getIndexPath(){
		return indexPath;
	}
	
	public void setIndexPath(String idxPath){
		this.indexPath = idxPath;
	}
}
