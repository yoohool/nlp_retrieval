package retrieve.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FullTextSearchParams {
	
	// searching key word
	private String queryWord = "";
	
	// query field
	private List<String> assignField = new ArrayList<String>();
	
	// display field
	private String[] viewFields;
	
	// highlight 
	private boolean isHighlight = true;
	
	// highlight field
	private String[] highlightFields;
	
	// highlight prefix 
	private String preHighlight = "<em class=\"highlight\">";
	
	// highlight suffix
	private String postHighlight = "</em>";
	
	// sorting field, string: domain to be sorted, boolean true means ascending order
	private Map<String,Boolean> sortField = new HashMap<String,Boolean>();
	
	// filter field
	private Map<String,String> filterField = new HashMap<String,String>();
	
	// start line
	private int startNums = 0;
	
	// page display line nums
	private int pageNum =0
			
	private boolean isFacet = false;
	
	private String[] facetFields;
}
