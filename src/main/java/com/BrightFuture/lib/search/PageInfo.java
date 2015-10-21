package com.BrightFuture.lib.search;

import java.util.List;

import com.googlecode.genericdao.search.Sort;


public class PageInfo 
{
	private int currentPage;
	private int numberOfPages;
	private boolean firstPage;
	private boolean lastPage;
	private List<Sort> sorts;

	/**
	 * The generic DAO works of a zero based page counting. Grrr. 
	 * So if there are 17 results and 10 results per page. 
	 * Number of pages = 1
	 * First page = 0
	 * @param search
	 * @param totalCount
	 */
	public PageInfo(Search<?> search, int totalCount)
    {
	    numberOfPages = totalCount / search.getMaxResults();
	    
	    currentPage = search.getPage();
	    
	    firstPage = currentPage == 0;
	    lastPage = currentPage == numberOfPages;
	    
	    sorts = search.getSorts();
    }
	
    @Override
    public String toString()
    {
        return "PageInfo [currentPage=" + currentPage + ", numberOfPages="
                + numberOfPages + ", firstPage=" + firstPage + ", lastPage="
                + lastPage + ", sorts=" + sorts + ",]";
    }

    public int getCurrentPage()
    {
        return currentPage;
    }

    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public boolean getFirstPage()
    {
        return firstPage;
    }

    public boolean getLastPage()
    {
        return lastPage;
    }
    
    public List<Sort> getSorts() {
		return sorts;
	}
}
