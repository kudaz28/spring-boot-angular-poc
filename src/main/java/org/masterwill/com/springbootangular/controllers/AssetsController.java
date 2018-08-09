package org.masterwill.com.springbootangular.controllers;

import java.util.List;

import org.masterwill.com.springbootangular.model.Asset;
import org.masterwill.com.springbootangular.repository.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/assets")
public class AssetsController 
{
	@Autowired
	private AssetsRepository assetsRepository;
	
	/**
	 * List all Assets
	 * @return
	 */
	@GetMapping
	public List<Asset> list()
	{
		return assetsRepository.findAll();
	}
	
	/**
	 * Create an Asset
	 * @param asset
	 */
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Asset asset)
	{
		assetsRepository.save(asset);
	}
	
	/**
	 * Return a specific Asset
	 * @param assetId
	 * @return
	 */
	@GetMapping("/{assetId}")
	public Asset get(@PathVariable("assetId") long assetId)
	{
		return assetsRepository.getOne(assetId);
	}
}
