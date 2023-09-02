package mapInterface.hashMap;

public class HotInternalWorkingOfHahMap {

	/*
	 *
	 * 1. default constructor of a hashMap creates 16 buckets, each bucket
	 * represents a node
	 * 
	 * #Node-it contains
	 * 
	 * 
	 * -----------hashValue-key-value-address of next node---------------------
	 * 
	 * # hashValue is get by doing some operation on hashCode of key
	 * 
	 * # hashValue of null key is always zero
	 * 
	 * 
	 *
	 * 2.Load Factor of a hashMap-0.75
	 * 
	 * initial capacity(when hashMap is declared)=16
	 * 
	 * new capacity of hashMap(no. of nodes/buckets)=old capacity*2
	 * 
	 * capacity of bucket is increased when no. of buckets/nodes is equal to or
	 * greater than threshold number
	 * 
	 * threshold number=capacity*load factor=16*0.75=12;
	 * 
	 * 3.no. of entries and no. of buckets will be different, because there can be
	 * multiple entries inside single bucket
	 * 
	 * 
	 */

	public static void main(String[] args) {

	}

}
