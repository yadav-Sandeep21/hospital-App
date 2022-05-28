package hospital_App.dao;

import hospital_App.dto.Address;

public interface AddressInterfaceDao {
	public abstract Address saveAddress(int branchId, Address address);
	public abstract Address getAddressById(int id);
	public abstract Address updateAddressById(int id, Address address);
}
