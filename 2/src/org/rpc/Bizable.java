package org.rpc;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface Bizable extends  VersionedProtocol{
	public abstract String hello(String name);
}

