package aoa.aodv.pdu;

import aoa.aodv.exception.BadPduFormatException;

public interface Packet {
		
	public byte[] toBytes();
	
	public String toString();
	
	public void parseBytes(byte[] rawPdu) throws BadPduFormatException;

	public int getDestinationAddress();
}
