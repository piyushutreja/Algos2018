package custom.hashmap;

//http://blog.miyozinc.com/algorithms/custom-hashmap-implementation-in-java/
public class CustomHashMap<K , V  > implements Map<K, V>{
	

	private Entry<K,V> [] buckets;
	private static final int INITIAL_CAPACITY=1<<4;
	private static  int CAPACITY=1<<4;
	
	private int  size =0; 
	
	public CustomHashMap(int capacity)
	{
		this.buckets= new Entry[capacity];
		this.CAPACITY= CAPACITY;
		
	}

	public CustomHashMap()
	{
		this(INITIAL_CAPACITY);
	}
	

	public void put(K key, V value) {
		
		
		//Create a new Entry		
		Entry<K,V> entry = new Entry <K,V>(key, value,null);
		
		//get bucket
		int bucket=(getHash(key)*21)%getBucketSize();
		
		Entry<K,V> existing = buckets[bucket];

		if(null==existing)
		{
			buckets[bucket]=entry;
			size++;
		}
		else
		{
			//compare keys to compare if already exist
			
			
			while(existing.next != null)
			{
				if(existing.next.getKey().equals(entry.getKey()))
				{
					existing.setValue(entry.getValue());
					return;
				}
				
				  existing = existing.next;
			}
			 if (existing.key.equals(key)) {
	                existing.value = value;
	            } else {
	                existing.next = entry;
	                size++;
	            }
	        
			
		}
		
	}

	private int getBucketSize() {
					
		return CAPACITY;
	
	}

	private int getHash(K key) {
		return key.hashCode();
	
	}

	public V  get(K key) {
		
	int   bucket = (getHash(key)*21)%getBucketSize();
	
	Entry<K,V> entry = buckets[bucket];
	
	while(entry != null)
		{
		
	if(key == entry.key)
	
	{
		return entry.value;
	}
	
	entry= entry.next;
		
		
	}
		
		return null;
		
	}

	
	public static class Entry<K,V> {
		
		K key; 
		
		V value;
		
		Entry<K , V > next; 
		
		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public Entry<K, V> getNext() {
			return next;
		}

		public void setNext(Entry<K, V> next) {
			this.next = next;
		}

	
		
		public Entry(K key, V value,Entry<K,V> next)
		{
			this.key=key;
			this.value=value;
			this.next=next;
		}
		
		
	}
	
	
	
}
