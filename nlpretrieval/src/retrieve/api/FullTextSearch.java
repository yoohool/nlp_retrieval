package retrieve.api;

public interface FullTextSearch {
	
	// start the service
	public int beginService();
	
	// stop the service
	public int stopService();
	
	// index
	public void doIndex(FullTextIndexParams ftip);
	
	// retrieve
	public FullTextResult doSearch(FullTextSearchParams ftsp);
}
