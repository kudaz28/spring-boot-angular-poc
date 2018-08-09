package org.masterwill.com.springbootangular.repository;

import org.masterwill.com.springbootangular.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetsRepository extends JpaRepository<Asset, Long>
{
	/*public List<Asset> findAll();

	public void create();

	public Asset find(Long assetId);*/
}
