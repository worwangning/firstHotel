package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IKindBiz{
	public boolean saveKind(Kind kind);
	public boolean removeKind(int id);
	public Kind getKind(int id);
	public List<Kind> findKind();
}