# Rename MassiveBlock → SingularityBlock

## Files to rename (Java)

| Old | New |
|-----|-----|
| `src/main/java/kayla/pulderessence/block/custom/MassiveBlock.java` | `…/SingularityBlock.java` (class rename) |
| `src/main/java/kayla/pulderessence/block/custom/MassiveBlockEntity.java` | `…/SingularityBlockEntity.java` (class rename) |

Edit contents of:
- `ModBlocks.java` — `MASSIVE_BLOCK`→`SINGULARITY_BLOCK`, class ref, registry ID `massive_block`→`singularity_block`
- `ModBlockEntities.java` — `MASSIVE_BLOCK_ENTITY`→`SINGULARITY_BLOCK_ENTITY`, class ref, registry ID `massive_block_entity`→`singularity_block_entity`

## Files to rename (resources)

`src/main/resources/assets/pulderessence/`:
- `blockstates/massive_block.json` → `blockstates/singularity_block.json`
- `models/block/massive_block.json` → `models/block/singularity_block.json`
- `models/item/massive_block.json` → `models/item/singularity_block.json` (update parent)
- `textures/block/massive_block.png` → `textures/block/singularity_block.png`
- `loot_tables/blocks/massive_block.json` → `loot_tables/blocks/singularity_block.json`

## Order of operations

1. Rename Java files (old → new, update class names + package)
2. Edit `ModBlocks.java` and `ModBlockEntities.java`
3. Rename resource files
4. `git rm` old files (if tracked)
5. Build to verify
