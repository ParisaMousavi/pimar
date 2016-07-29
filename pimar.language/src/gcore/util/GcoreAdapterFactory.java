/**
 */
package gcore.util;

import gcore.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gcore.GcorePackage
 * @generated
 */
public class GcoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GcorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GcorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GcoreSwitch<Adapter> modelSwitch =
		new GcoreSwitch<Adapter>() {
			@Override
			public Adapter casePageContainer(PageContainer object) {
				return createPageContainerAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseRGBColor(RGBColor object) {
				return createRGBColorAdapter();
			}
			@Override
			public Adapter caseEditPage(EditPage object) {
				return createEditPageAdapter();
			}
			@Override
			public Adapter caseListPage(ListPage object) {
				return createListPageAdapter();
			}
			@Override
			public Adapter caseViewPage(ViewPage object) {
				return createViewPageAdapter();
			}
			@Override
			public Adapter caseCustomPage(CustomPage object) {
				return createCustomPageAdapter();
			}
			@Override
			public Adapter caseLoginPage(LoginPage object) {
				return createLoginPageAdapter();
			}
			@Override
			public Adapter caseProcessSelectorPage(ProcessSelectorPage object) {
				return createProcessSelectorPageAdapter();
			}
			@Override
			public Adapter caseSelectableListPage(SelectableListPage object) {
				return createSelectableListPageAdapter();
			}
			@Override
			public Adapter caseListablePage(ListablePage object) {
				return createListablePageAdapter();
			}
			@Override
			public Adapter caseSelectablePage(SelectablePage object) {
				return createSelectablePageAdapter();
			}
			@Override
			public Adapter caseMenuablePage(MenuablePage object) {
				return createMenuablePageAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseStyleSetting(StyleSetting object) {
				return createStyleSettingAdapter();
			}
			@Override
			public Adapter caseStylePageSettings(StylePageSettings object) {
				return createStylePageSettingsAdapter();
			}
			@Override
			public Adapter caseStyleListSettings(StyleListSettings object) {
				return createStyleListSettingsAdapter();
			}
			@Override
			public Adapter caseStyleMenuSettings(StyleMenuSettings object) {
				return createStyleMenuSettingsAdapter();
			}
			@Override
			public Adapter caseStyleSelectionSettings(StyleSelectionSettings object) {
				return createStyleSelectionSettingsAdapter();
			}
			@Override
			public Adapter caseMapPage(MapPage object) {
				return createMapPageAdapter();
			}
			@Override
			public Adapter caseMediaPage(MediaPage object) {
				return createMediaPageAdapter();
			}
			@Override
			public Adapter caseELearningPage(ELearningPage object) {
				return createELearningPageAdapter();
			}
			@Override
			public Adapter caseTakePicturePage(TakePicturePage object) {
				return createTakePicturePageAdapter();
			}
			@Override
			public Adapter caseRecordAudioPage(RecordAudioPage object) {
				return createRecordAudioPageAdapter();
			}
			@Override
			public Adapter caseARPage(ARPage object) {
				return createARPageAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseENamedElement(ENamedElement object) {
				return createENamedElementAdapter();
			}
			@Override
			public Adapter caseEPackage(EPackage object) {
				return createEPackageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gcore.PageContainer <em>Page Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.PageContainer
	 * @generated
	 */
	public Adapter createPageContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.RGBColor
	 * @generated
	 */
	public Adapter createRGBColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.EditPage <em>Edit Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.EditPage
	 * @generated
	 */
	public Adapter createEditPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.ListPage <em>List Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.ListPage
	 * @generated
	 */
	public Adapter createListPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.ViewPage <em>View Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.ViewPage
	 * @generated
	 */
	public Adapter createViewPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.CustomPage <em>Custom Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.CustomPage
	 * @generated
	 */
	public Adapter createCustomPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.LoginPage <em>Login Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.LoginPage
	 * @generated
	 */
	public Adapter createLoginPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.ProcessSelectorPage <em>Process Selector Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.ProcessSelectorPage
	 * @generated
	 */
	public Adapter createProcessSelectorPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.SelectableListPage <em>Selectable List Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.SelectableListPage
	 * @generated
	 */
	public Adapter createSelectableListPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.ListablePage <em>Listable Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.ListablePage
	 * @generated
	 */
	public Adapter createListablePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.SelectablePage <em>Selectable Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.SelectablePage
	 * @generated
	 */
	public Adapter createSelectablePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.MenuablePage <em>Menuable Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.MenuablePage
	 * @generated
	 */
	public Adapter createMenuablePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.StyleSetting <em>Style Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.StyleSetting
	 * @generated
	 */
	public Adapter createStyleSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.StylePageSettings <em>Style Page Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.StylePageSettings
	 * @generated
	 */
	public Adapter createStylePageSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.StyleListSettings <em>Style List Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.StyleListSettings
	 * @generated
	 */
	public Adapter createStyleListSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.StyleMenuSettings <em>Style Menu Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.StyleMenuSettings
	 * @generated
	 */
	public Adapter createStyleMenuSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.StyleSelectionSettings <em>Style Selection Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.StyleSelectionSettings
	 * @generated
	 */
	public Adapter createStyleSelectionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.MapPage <em>Map Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.MapPage
	 * @generated
	 */
	public Adapter createMapPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.MediaPage <em>Media Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.MediaPage
	 * @generated
	 */
	public Adapter createMediaPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.ELearningPage <em>ELearning Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.ELearningPage
	 * @generated
	 */
	public Adapter createELearningPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.TakePicturePage <em>Take Picture Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.TakePicturePage
	 * @generated
	 */
	public Adapter createTakePicturePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.RecordAudioPage <em>Record Audio Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.RecordAudioPage
	 * @generated
	 */
	public Adapter createRecordAudioPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gcore.ARPage <em>AR Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gcore.ARPage
	 * @generated
	 */
	public Adapter createARPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EPackage
	 * @generated
	 */
	public Adapter createEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GcoreAdapterFactory
