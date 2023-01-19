package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Differencing;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureInverting;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.MetadataUsage;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Unioning;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UsageImpl.class)
public abstract class UsageImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<UsageImpl, Usage> directedUsage;
	public static volatile SingularAttribute<UsageImpl, String> declaredShortName;
	public static volatile ListAttribute<UsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<UsageImpl, Feature> chainingFeature;
	public static volatile ListAttribute<UsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<UsageImpl, Boolean> isConjugated;
	public static volatile ListAttribute<UsageImpl, Usage> usage;
	public static volatile SingularAttribute<UsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<UsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<UsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<UsageImpl, Type> type;
	public static volatile ListAttribute<UsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<UsageImpl, Feature> output;
	public static volatile ListAttribute<UsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<UsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<UsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<UsageImpl, Usage> variant;
	public static volatile SingularAttribute<UsageImpl, Boolean> isSufficient;
	public static volatile ListAttribute<UsageImpl, StateUsage> nestedState;
	public static volatile ListAttribute<UsageImpl, Differencing> ownedDifferencing;
	public static volatile SingularAttribute<UsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<UsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<UsageImpl, UUID> elementId;
	public static volatile ListAttribute<UsageImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<UsageImpl, Boolean> isLibraryElement;
	public static volatile SingularAttribute<UsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<UsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<UsageImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<UsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<UsageImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<UsageImpl, String> qualifiedName;
	public static volatile ListAttribute<UsageImpl, Documentation> documentation;
	public static volatile ListAttribute<UsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<UsageImpl, Type> intersectingType;
	public static volatile ListAttribute<UsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<UsageImpl, Feature> endFeature;
	public static volatile ListAttribute<UsageImpl, Feature> directedFeature;
	public static volatile SingularAttribute<UsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<UsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<UsageImpl, Type> featuringType;
	public static volatile ListAttribute<UsageImpl, Feature> input;
	public static volatile ListAttribute<UsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<UsageImpl, Boolean> isComposite;
	public static volatile ListAttribute<UsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<UsageImpl, String> name;
	public static volatile SingularAttribute<UsageImpl, String> shortName;
	public static volatile ListAttribute<UsageImpl, Element> ownedMember;
	public static volatile ListAttribute<UsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<UsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<UsageImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<UsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<UsageImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<UsageImpl, AllocationUsage> nestedAllocation;
	public static volatile ListAttribute<UsageImpl, Membership> membership;
	public static volatile SingularAttribute<UsageImpl, Boolean> isPortion;
	public static volatile SingularAttribute<UsageImpl, Boolean> isImpliedIncluded;
	public static volatile ListAttribute<UsageImpl, ReferenceUsage> nestedReference;
	public static volatile ListAttribute<UsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<UsageImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<UsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<UsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<UsageImpl, Feature> feature;
	public static volatile ListAttribute<UsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<UsageImpl, Element> member;
	public static volatile ListAttribute<UsageImpl, Feature> ownedEndFeature;
	public static volatile SingularAttribute<UsageImpl, String> declaredName;
	public static volatile SingularAttribute<UsageImpl, Boolean> isReference;
	public static volatile ListAttribute<UsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<UsageImpl, Classifier> definition;
	public static volatile ListAttribute<UsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile ListAttribute<UsageImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<UsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<UsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<UsageImpl, Element> ownedElement;
	public static volatile ListAttribute<UsageImpl, String> aliasIds;
	public static volatile ListAttribute<UsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<UsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<UsageImpl, FeatureMembership> featureMembership;
	public static volatile CollectionAttribute<UsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<UsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<UsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<UsageImpl, MetadataUsage> nestedMetadata;
	public static volatile ListAttribute<UsageImpl, Type> differencingType;
	public static volatile CollectionAttribute<UsageImpl, VariantMembership> variantMembership;
	public static volatile ListAttribute<UsageImpl, RenderingUsage> nestedRendering;
	public static volatile ListAttribute<UsageImpl, Unioning> ownedUnioning;
	public static volatile ListAttribute<UsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<UsageImpl, Type> unioningType;
	public static volatile ListAttribute<UsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<UsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<UsageImpl, Intersecting> ownedIntersecting;
	public static volatile ListAttribute<UsageImpl, ViewpointUsage> nestedViewpoint;
	public static volatile CollectionAttribute<UsageImpl, FeatureInverting> ownedFeatureInverting;

	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String DECLARED_SHORT_NAME = "declaredShortName";
	public static final String NESTED_PART = "nestedPart";
	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String VARIANT = "variant";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String NESTED_STATE = "nestedState";
	public static final String OWNED_DIFFERENCING = "ownedDifferencing";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String ELEMENT_ID = "elementId";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_LIBRARY_ELEMENT = "isLibraryElement";
	public static final String IS_DERIVED = "isDerived";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String INTERSECTING_TYPE = "intersectingType";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NESTED_VIEW = "nestedView";
	public static final String NAME = "name";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_PORTION = "isPortion";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String DECLARED_NAME = "declaredName";
	public static final String IS_REFERENCE = "isReference";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String DEFINITION = "definition";
	public static final String NESTED_USE_CASE = "nestedUseCase";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String DIRECTION = "direction";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String NESTED_METADATA = "nestedMetadata";
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String UNIONING_TYPE = "unioningType";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";
	public static final String OWNED_FEATURE_INVERTING = "ownedFeatureInverting";

}

