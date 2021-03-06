package searching.boxAdapter;

import java.io.FileNotFoundException;

import common_data.item.Position2D;
import common_data.level.Level;
import searchable.Searchable;
import searchable.Solution;
import searcher.BFS;
import searcher.Searcher;
import searching.search_util.SearchUtil;

public class RunBoxSearch
{
	static String path = "./levels/level2.txt";

	public static void main(String[] args) throws FileNotFoundException 
	{
		Level level = SearchUtil.loadLevel(path);
		SearchUtil.printLevel(level);
		Searchable<BoxState> adapter = new BoxSearchAdapter(level.getCharGameBoard(), new Position2D(3,3), new Position2D(1,17));
		Searcher<BoxState> searcher = new BFS<BoxState>();
		Solution sol = searcher.search(adapter);
		if(sol == null)
		{
			System.out.println("NULL");
		}
		else
		{
			System.out.println("SOLUTION: ");
			System.out.println(sol);
		}
	}
	

}
