# FabricPulverEssence

# Added
Blocks
- Mythril Ore
- Indium Ore
- Mythril Block
- Indium Block
- Yttrium, Silver, Lead, Tungsten, Energium storage blocks
- 49 real-world mineral ore block types (stone + deepslate variants)
- Pulverent Log/Wood/Planks, Stairs, Slab, Button, Pressure Plate, Door, Trapdoor, Fence, Wall and Gate
- Stripped Pulverent Log/Wood
- Pulverent Nylium
- 610 cable blocks (45 elements + 14 alloys + 8 superconductors + 4 fictional, 5 thicknesses x bare/insulated)
- 12+ machine types (Smelter, Macerator, Ore Washer, Thermal Centrifuge, Electrolyzer, Blast Furnace, Chemical Reactor, Distillation Tower, Crystallizer, Mixer, Vacuum Furnace, Compressor, Alloy Smelter) with 12 voltage tiers

Items
- Mythril Tools (equivalent to Iron+)
- Raw Mythril & Block
- Raw Indium
- Mythril Ingot, Rod, Nugget
- Faerie Dust and Rod
- Indium Ingot, Rod, Nugget
- Charged variants of Rods (30+ elemental + 80+ alloy)
- Full elemental ingot list (~50 elements)
- 100+ alloy ingots (Al-based, Bronze/Brass, Steels, Ni-based, Ti-based, Mg-based, Precious, Superconductor, Fictional)
- 58 elemental dusts + 70+ alloy dusts
- Nuggets for Lead, Yttrium, Tungsten, Indium, Mythril, Silver
- Buckets (Ammonia, Sulfuric Acid, Hydrochloric Acid) + bottle intermediates
- 61 wire items (one per cable material)
- Crafting components (Energium Shard, Silicon Boule)

Chemistry
- Added all 118 elements to own group + 5 fictional (Naquadah, Naquadrium, Energium, Eridium, Mythril)
- CompoundItem with auto-generated chemical formula tooltips
- Mixin-based tooltip overlay adds element symbols to vanilla items
- Helper methods for chemical recipes

Energy
- Full cable network with 610 blocks connecting via directional blockstates
- EnergyProvider/EnergyConsumer interfaces for machine integration
- Dynamic energy network manager with merging/splitting/ticking
- Over-voltage causes explosions per block
- 12 voltage tiers: ULV (8V) -> MLV (64V) -> LV (512V) -> LLV (4kV) -> MV (32kV) -> HV (262kV) -> EHV (2MV) -> SHV (16MV) -> UHV (132MV) -> VHV (1GV) -> XHV (8.5GV) -> MHV (67.7GV)

World Generation
- Custom ore vein generation with 6 tier groups and 30+ vein types at different Y-levels
- Custom VoidChunkGenerator registered as pulderessence:void_chunk_generator (void world with no terrain)

Datagen
- Full Fabric datagen pipeline: block/item tags, loot tables, recipes, models/blockstates, language, world gen
- 1830 generated cable blockstate+model files via atlas texture system

Physics
- Black holes working as intended, and generating randomly sparsely within space dimension
