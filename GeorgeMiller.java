


public class GeorgeMiller {

protected String mName;
	
protected int mFollowers;

protected GeorgeMiller(String name, int, followers)
{
	mName = name;
	mFollowers = followers;
}
	
	public String getName()
	{
		return mName;
	}
	public int getFollowers()
	{
		return mFollowers;
	}
		public void setName(String name)
		{
			mName = name;
		}
		public void setFollowers(int followers)
		{
			mFollowers = followers;
		}
	public boolean equals (GeorgeMiller other)
	{
		return mName == other.mName && mFollowers == other.mFollowers;
	}
	
		public String toString()
		{
			return System.out.printf(
		}
			
	
}
